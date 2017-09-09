package com.math.bignumbertowords

import java.math.BigInteger
import java.text.NumberFormat
import java.util.*
import kotlin.String
import kotlin.collections.HashMap

/**
 * Created by rahamathullahrahamathullah on 7/6/17.
 */

fun main(args: Array<String>) {
    val obj: NumberToWordIndian = NumberToWordIndian();
    TestCasesForIndianAndWestern().printNum_1_10_100_1000_etc(obj)
    TestCasesForIndianAndWestern().printNum_9_99_999_9999_etc(obj)
    NumberToWordIndian().convertToNumberName("1000")
}

class NumberToWordIndian {

    private val aMap = HashMap<String, String>()

    fun convertToNumberName(str: String): String {
        NumberUtil().setIndianNumberNameBase(aMap);
        val num = BigInteger(str).toString()
        val sb = StringBuffer()

        try {
            NumberUtil().isValidNumber(num)
        } catch (e: InvalidNumberException) {
            e.printStackTrace()
        }

        val numLen = num.length
        for (i in 1..numLen) {
            if (num.length == 1) {
                sb.append(getNumberNameFor1Digit(num))
                break
            } else if (num.length == 2) {
                sb.append(getNumberNameFor2Digit(num))
                break
            } else if (num.length == 3) {
                sb.append(getNumberNameFor1Digit(num.substring(0, 1))) // One Hundrad
                sb.append(aMap["10^2"])
                sb.append(getNumberNameFor2Digit(num.substring(1, numLen))) // Ten Hundrad
                break
            } else {
                if ((numLen - 1) % 2 == 0) {
                    var st = 0
                    var ed = 2
                    val x = numLen - 3
                    var zeroLen = numLen
                    while (st < x) {
                        val temp = getNumberNameFor2Digit(num.substring(st, ed))
                        if (st == 0 && ed == 2) {
                            sb.append(temp)
                            sb.append(aMap["10^" + (zeroLen - 1)])
                        } else if (temp != null && temp != "") {
                            sb.append(temp + aMap["10^" + (zeroLen - 1)])
                        }
                        st = st + 2
                        ed = ed + 2
                        zeroLen = zeroLen - 2
                    }
                    sb.append(getNumberNameFor3Digit(num.substring(x, numLen)))

                } else {
                    var st = 0
                    var ed = 1
                    val x = numLen - 3
                    var zeroLen = numLen

                    while (st < x) {
                        val temp = getNumberNameFor1Digit(num.substring(st, ed))
                        if (st == 0 && ed == 1) {
                            sb.append(temp)
                            sb.append(aMap["10^" + zeroLen])

                        } else {
                            val temp1 = getNumberNameFor2Digit(num.substring(st, ed))

                            if (temp1 != null && temp1 != "") {

                                sb.append(temp1)
                                sb.append(aMap["10^" + zeroLen])
                            }
                        }
                        if (st == 0)
                            st = st + 1
                        else
                            st = st + 2
                        ed = ed + 2
                        zeroLen = zeroLen - 2
                    }
                    sb.append(getNumberNameFor3Digit(num.substring(x, numLen)))
                }
                break
            }
        }
        println(num + "(10^" + (num.length - 1) + ")" + "\n[" + NumberUtil().getNumberInIndianFormat(num) + "]\n" + sb.toString() + "\n")
        //		NumberUtil.writeToFile(file,
        //				num + "(10^" + (num.length()-1) + ")" + "\n[" + NumberUtil.getNumberInIndianFormat(num)
        //				+ "]\n" + sb.toString() + "\n");
        return sb.toString()
    }

    private fun getNumberNameFor3Digit(num: kotlin.String): String {
        var num = num
        num = Integer.valueOf(num).toString()

        if (Integer.valueOf(num) <= 0)
            return ""
        else if (Integer.valueOf(num) <= 99)
            return getNumberNameFor2Digit(num)
        else if (Integer.valueOf(num) <= 999)
            return getNumberNameFor1Digit(num[0] + "") +
                    aMap.getValue("10^2") +
                    getNumberNameFor2Digit(num.substring(1, num.length))

        return ""
    }

    private fun getNumberNameFor2Digit(num: kotlin.String): String {
        var num = num
        num = Integer.valueOf(num).toString()

        if (Integer.valueOf(num) <= 0)
            return ""
        else if (Integer.valueOf(num) <= 9)
            return getNumberNameFor1Digit(num)

        if (Integer.valueOf(num) >= 11 && Integer.valueOf(num) <= 19) {
            return aMap.getValue(num) // 11 to 19

        } else {
            if (num[1] == '0')
                return aMap.getValue(num[0] + "0") // > 20,30,40,50,60,70,80,90
            else
                return aMap.getValue(num[0] + "0") + aMap.getValue(num[1] + "") // > 21
        }
    }

    private fun getNumberNameFor1Digit(num: kotlin.String): String {
        if (Integer.valueOf(num) >= 1 && Integer.valueOf(num) <= 9)
            return aMap.getValue(num) // 1 to 9
        else
            return ""
    }
}