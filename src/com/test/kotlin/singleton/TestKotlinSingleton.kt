package com.test.kotlin.singleton

fun main(args: Array<String>) {
	
	
	val kotlingSingleton: KotlinSingleton = KotlinSingleton.getInstance()
	
	println(kotlingSingleton.getName())
	
	// output: KotlinProg
}