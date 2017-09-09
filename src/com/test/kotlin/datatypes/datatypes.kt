package com.test.kotlin.datatypes

fun main(args: Array<String>) {
	/*
	Double	64
	Float	32
	Long	64
	Int	32
	Short	16
	Byte	8 */
	
	val st: String = "hi hello!";
	println(st)
	
	val b: Byte = 1
	val s: Short = 1
	val i: Int = 10
	val f: Float = 10.2f
	val l: Long = 10
	val d: Double = 10.2
	
	println(  "Byte: " + b + ", "
			+ "Short: " + s + ", "
			+ "Int: " + i + ", "
			+ "Float: " + f + ", "
			+ "Long: " + l + ", "
			+ "Double: " + d)
	
	
	// Underscores in numeric literals (since 1.1)
	// You can use underscores to make number constants more readable:
	val oneMillion = 1_000_000
	println("oneMillion: " + oneMillion)
	
	val creditCardNumber = 1234_5678_9012_3456L
	println("creditCardNumber: " + creditCardNumber)
	
	val socialSecurityNumber = 999_99_9999L
	println("socialSecurityNumber: " + socialSecurityNumber)
	
	val hexBytes = 0xFF_EC_DE_5E
	println("hexBytes: " + hexBytes) // 4293713502
	
	val bytes = 0b11010010_01101001_10010100_10010010
	println("bytes: " + bytes) // 3530134674

	
	var c: Char = 'a'
	println(c + ", " + c.toInt())
	
	
	var flag: Boolean = true
	println("flag: " + flag)
	
	
	val a: Int = 1000
	println(a === a) // Prints 'true'
	val boxedA: Int? = a
	val anotherBoxedA: Int? = a
	println(boxedA === anotherBoxedA) // !!!Prints 'false'!!!

	
	val asc = Array(10, { i -> (i * i).toString() })
	for (c in asc) {
		println(c)
	}
	
	
	val text = """
    for (c in "foo")
        print(c)
        """
	println(text)
	
	
	val ss = "abc"
	val str = "$ss.length is ${ss.length}" + "sdsddsdsdsds" // evaluates to "abc.length is 3"
	println(str)

	
	val price = """
		${'$'}9.99
		"""
		println(price)

	

}