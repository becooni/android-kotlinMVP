package com.jake.kotlinsample

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun test() {
        val items = listOf(1, 2, 3, 4, 5)

        // Lambdas are code blocks enclosed in curly braces.
        items.fold(0, {
            // When a lambda has parameters, they go first, followed by '->'
            acc: Int, i: Int ->
            print("acc = $acc, i = $i, ")
            val result = acc + i
            println("result = $result")
            // The last expression in a lambda is considered the return value:
            result
        })
        // Parameter types in a lambda are optional if they can be inferred:
        val joinedToString = items.fold("Elements:", { acc, i -> "$acc $i" })

        // Function references can also be used for higher-order function calls:
        val product = items.fold(1, Int::times)

        println("joinedToString = $joinedToString")
        println("product = $product")
    }
}
