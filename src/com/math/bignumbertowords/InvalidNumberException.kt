package com.math.bignumbertowords

import java.lang.Exception
import javax.naming.Context

private val msg = "Number is not natural or positive!"

fun InvalidNumber(): InvalidNumberException {
    return InvalidNumberException(msg)
}

fun InvalidNumberException(message: String): InvalidNumberException {
    val ex = null
    return InvalidNumberException(message, ex)
}

class InvalidNumberException(message: String, ex: Exception?): Exception(message, ex) {
}