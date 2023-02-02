package com.example.mylibrary

interface MathOperation {
    fun addition(a: Int , b: Int): Int{
        var c = a+b;
        return c
    }
    fun subtraction(a: Int, b: Int): Int{
        var c = a - b
        return c
    }
}