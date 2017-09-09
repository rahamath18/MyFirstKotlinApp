package com.test.kotlin

fun main(args: Array<String>) {
	println("Hi Hello")
	println(isPalidrome("aba1"))
	var my = MyMain()
	println(my.isPalidrome("aba"))
}

fun isPalidrome(s: String): Boolean {
	 var ss = s.reversed()
    if(s == ss)
    	return true
    else
    	return false
}