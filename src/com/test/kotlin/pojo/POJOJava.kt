package com.test.kotlin.pojo

import java.io.Serializable

class Employee : Serializable {

    private val serialVersionUID = 1L

    var name: String? = null

    var id: Int? = null

    var isActive: Boolean = false

    var childNames: List<String>? = null

    constructor() {
        println("default constructor")
    }

    constructor(name: String, id: Int, active: Boolean, childNames: List<String>?) {
        this.name = name
        this.id = id
        this.isActive = active
        this.childNames = childNames
    }

    override fun toString(): String {
        return this.name + ", " + this.id + ", " + this.isActive + ", " + this.childNames
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun equals(obj: Any?): Boolean {
        return super.equals(obj)
    }
}