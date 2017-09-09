package com.test.kotlin

import java.util.ArrayList

class MyMain {
	
	fun isPalidrome(s: String): Boolean {
		var ss = s.reversed()
	    if(s == ss)
	    	return true
	    else
	    	return false
	}
	
}