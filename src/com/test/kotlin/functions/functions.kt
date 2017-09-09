package com.test.kotlin.functions

import java.text.NumberFormat
import java.util.Locale
import java.math.BigInteger

fun main(args: Array<String>) {
	
	println(sayHello())
	println(sayHello("Andrey Breslav"))
	println(method1(10, "hi i am function"))
	
	println("sum of 19 and 23 is ${sum(19, 23)}")
	
	val strTemp: String = NumberFormat.getNumberInstance(Locale.US).format(BigInteger("999"))
	println(strTemp)

}

fun sayHello(): String {
	return "hello!"
}

fun sayHello(s: String): String {
	return "hello " + s + "!"
}

fun method1(i: Int, s: String): String {
	return ("${i}  - " + s)
}

fun sum(a: Int, b: Int) = a + b
