/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.danieltatarkin

import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {
    @Test
    fun testAppHasAGreeting() {
        val classUnderTest = App()
        val input = HandlerInput()
        input.message = "Hello"
        val expected = HandlerOutput("Hello", "Ahoy!")
        var output = classUnderTest.handleRequest(input, null)
        assertEquals(expected, output)
    }
}