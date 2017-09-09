package com.test.kotlin.controlflow

fun main(args: Array<String>) {
	
	// if
	var a: Int = 0
	if(a == 0)
		println("I am if control flow!: " + a)
	
	// When Expression
	var x = 3;
	when (x) {
    1 -> print("x == 1")
    2 -> print("x == 2")
	    else -> {
			// Note the block
	        print("x is neither 1 nor 2")
	    }
	}
	
	// for
//	for (i in x) {
//		print(array[i])
//	}	
}