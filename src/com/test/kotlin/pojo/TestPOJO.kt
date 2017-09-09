package com.test.kotlin.pojo

fun main(args: Array<String>) {
	
	var childNames: List<String> = listOf("child1", "child2")

    val obj:Employee = Employee("abcd", 1, true, childNames)
        
	println(obj)
	
	// output: abcd, 1, true, [child1, child2]
	// refer toString method
}