package com.test.kotlin.singleton

object KotlinSingleton {
	
private var commonApiConfig: KotlinSingleton? = null
	
fun getInstance(): KotlinSingleton {
	
    if (null == commonApiConfig) {
		
        commonApiConfig = KotlinSingleton
       }
	
    return KotlinSingleton!!
	
   }
	
   fun getName(): String {
        return "KotlinProg"
    }
	
}