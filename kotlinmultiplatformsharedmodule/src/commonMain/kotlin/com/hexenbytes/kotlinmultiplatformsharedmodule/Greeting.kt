package com.hexenbytes.kotlinmultiplatformsharedmodule

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}