package com.test.kotlin.pojo

class Address {
    var name: String = ""
    var street: String = ""
    var city: String = ""
    var state: String? = ""
    var zip: String = ""
	
	fun getName(): String {
		return this.name
	}
	
	
}