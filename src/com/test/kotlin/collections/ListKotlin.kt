package com.test.kotlin.collections

import java.util.ArrayList
import java.util.Arrays

/**
 * Created by rahamathullahrahamathullah on 7/25/17.
 */


    fun main(args: Array<String>) {

        // java.util.List<Integer> with classic approach
        val aNumList = ArrayList<Int>()
        aNumList.add(11)
        aNumList.add(12)
        aNumList.add(13)

        for (i in aNumList.indices) {
            println(aNumList[i])
        }
        run {
            val iterator = aNumList.iterator()
            while (iterator.hasNext()) {
                println(iterator.next())
            }
        }


        // java.util.List<String> with classic approach
        val aStrList = ArrayList<String>()
        aStrList.add("John")
        aStrList.add("Mathew")
        aStrList.add("Gospal")

        for (i in aStrList.indices) {
            println(aStrList[i])
        }
        val iterator = aStrList.iterator()
        while (iterator.hasNext()) {
            println(iterator.next())
        }


        // java.util.List<Integer> with LAMBDA approach
        val aNumberList = Arrays.asList(1, 2, 3)
        //aNumberList.forEach(System.out::println);

        for (value in aNumberList) {
            println(value)
        }


        // java.util.List<String> with LAMBDA approach
        val aStringList = Arrays.asList("Apple", "Banana", "Mango")
        //aStringList.forEach(System.out::println);

        for (value in aStringList) {
            println(value)
        }


    }

