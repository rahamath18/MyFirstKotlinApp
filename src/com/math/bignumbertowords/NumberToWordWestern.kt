package com.math.bignumbertowords

import java.math.BigInteger
import java.text.NumberFormat
import java.util.*
import kotlin.String
import kotlin.collections.HashMap

/**
 * Created by rahamathullahrahamathullah on 7/6/17.
 */

class NumberToWordWestern {

	private val aMap = HashMap<kotlin.String, kotlin.String>()

	fun convertToNumberName(str: kotlin.String ): String {
		NumberUtil().setWesternNumberNameBase(aMap);
		var num = str
		val sb: StringBuffer = StringBuffer();
		
		try {
			NumberUtil().isValidNumber(num);
		} catch (e: InvalidNumberException) {
			e.printStackTrace();
		}
		
		val numLen = num.length;
		for (i in 0..numLen - 1) {
			if(num.length == 1) {
				sb.append(getNumberNameFor1Digit(num));
				break;
			} else if(num.length == 2) {
				sb.append(getNumberNameFor2Digit(num));
				break;
			} else if(num.length == 3) {
				sb.append(getNumberNameFor1Digit(num.substring(0,1))); // One Hundrad
				sb.append(aMap.get("10^2"));
				sb.append(getNumberNameFor2Digit(num.substring(1, numLen))); // Ten Hundrad
				break;
			} else {
			    val strTemp = NumberFormat.getNumberInstance(Locale.US).format(BigInteger(num));
			    val count = strTemp.substring(0, strTemp.indexOf(",")).length;
				if(count == 1) { // 1,......
					var zeroLen = numLen;
					var st = 0;
					var ed = 1;
					var x = numLen - 2;
					while(st < x) {
			     		 if(st == 0 && ed == 1) {
			     			sb.append(getNumberNameFor1Digit(num.substring(st,ed))); 
							sb.append(aMap.get("10^" + zeroLen));
			     		 } else  {
							 val temp = getNumberNameFor3Digit(num.substring(st, ed));
			     			if(temp != null && !temp.equals("")) { 
			     				sb.append(temp);
			     				if(aMap.containsKey("10^"+(zeroLen)))
			     					sb.append(aMap.get("10^"+(zeroLen)));
			     			}
			     		 }
						if(st == 0)
							st = st + 1;
						else 
							st = st + 3;
						ed = ed + 3;
						zeroLen = zeroLen - 3;
					}
				} else if(count == 2) {  // 10,.....
					var zeroLen = numLen - 1;
					var st = 0;
					var ed = 2;
					var x = numLen - 2;
					while(st < x) {
			     		 if(st == 0 && ed == 2) {
			     			sb.append(getNumberNameFor2Digit(num.substring(st,ed))); 
							sb.append(aMap.get("10^" + zeroLen));
			     		 } else  {
			     			 val temp = getNumberNameFor3Digit(num.substring(st, ed));
			     			if(temp != null && !temp.equals("")) { 
			     				sb.append(temp);
			     				if(aMap.containsKey("10^"+(zeroLen)))
			     					sb.append(aMap.get("10^"+(zeroLen)));
			     			}
			     		 }
						if(st == 0)
							st = st + 2;
						else 
							st = st + 3;
						ed = ed + 3;
						zeroLen = zeroLen - 3;
					}
				} else if(count == 3 ) { // 100,.......
					var zeroLen = numLen - 2;
					var st = 0;
					var ed = 3;
					var x = numLen - 2;
					while(st < x) {
			     		 if(st == 0 && ed == 3) { 			     				
			     			val temp = getNumberNameFor3Digit(num.substring(st,ed));
			     			if(temp != null && !temp.equals("")) { 
			     				sb.append(getNumberNameFor3Digit(num.substring(st,ed)));
			     				sb.append(aMap.get("10^" + zeroLen));
			     			}
			     		 } else  {
			     			val temp = getNumberNameFor3Digit(num.substring(st, ed));
			     			if(temp != null && !temp.equals("")) { 
			     				sb.append(temp);
			     				if(aMap.containsKey("10^"+(zeroLen))) {
			     					//System.out.println("zeroLen: " + zeroLen);
			     					sb.append(aMap.get("10^"+(zeroLen)));
			     				}
			     			}
			     		 }
						if(st == 0)
							st = st + 3;
						else 
							st = st + 3;
						ed = ed + 3;
						zeroLen = zeroLen - 3;
					}
				}
				break;
			} 
		}
		System.out.println(num + "(10^" + (num.length-1) + ")" + "\n[" + NumberUtil().getNumberInWesternFormat(num) + "]\n" + sb.toString() + "\n");
//		NumberUtil.writeToFile(file, 
//				num + "(10^" + (num.length()-1) + ")" + "\n[" + NumberUtil.getNumberInWesternFormat(num) 
//				+ "]\n" + sb.toString() + "\n");
		return sb.toString();
	}
	
	private fun getNumberNameFor3Digit(num: String): String {
		if(Integer.valueOf(num) <=0)
			return "";
		
		else if(Integer.valueOf(num) <=99)
			return getNumberNameFor2Digit(num);
		
		else if(Integer.valueOf(num) <=999)
			return getNumberNameFor1Digit(num.get(0)+"") +
					aMap.get("10^2") +
					getNumberNameFor2Digit(num.substring(1, num.length));
		
		return "";
	}

	fun getNumberNameFor2Digit(num: kotlin.String): kotlin.String {

		if(num.toInt() <=0)
			return "";
		else if(num.toInt() <= 9)
			return getNumberNameFor1Digit(num);
			
		if(num.toInt() >= 11 && num.toInt() <= 19) {
			return aMap.getValue(num);
			
		} else  {
			if(num.get(1) == '0')
				return aMap.getValue(num.get(0)+"0");
			else
				return aMap.getValue(num.get(0)+"0") + aMap.getValue(num.get(1)+""); // > 21
		}
	}	
	
	fun getNumberNameFor1Digit(num: kotlin.String): kotlin.String {
		if(num.toInt() >= 1 && num.toInt() <= 9)
			return aMap.getValue(num) // 1 to 9
		else
			return "";
	}
}

fun main(args: Array<String>) {
	val obj: NumberToWordWestern = NumberToWordWestern();
	//TestCasesForIndianAndWestern().printNum_1_10_100_1000_etc(obj)
	TestCasesForIndianAndWestern().printNum_9_99_999_9999_etc(obj)
	NumberToWordWestern().convertToNumberName("1000")
}