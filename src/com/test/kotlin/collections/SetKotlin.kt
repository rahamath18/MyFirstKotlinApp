package com.test.kotlin.collections

import java.util.HashSet

/**
 * Created by rahamathullahrahamathullah on 7/27/17.
 */

fun main(args: Array<String>) {

    // java.util.Set<Integer> with classic approach
    val aNumSet = HashSet<Int>()
    aNumSet.add(11)
    aNumSet.add(12)
    aNumSet.add(13)

    val iterator = aNumSet.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    // java.util.Set<String> with classic approach
    val aStrSet = HashSet<String>()
    aStrSet.add("John")
    aStrSet.add("Mathew")
    aStrSet.add("Gospal")
	
	

}