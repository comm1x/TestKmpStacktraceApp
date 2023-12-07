package com.example.testkmpstacktraceapp

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        var a: Int? = null
        requireNotNull(a)
        requireNotNull(a)
        requireNotNull(a)

        return "Hello, ${platform.name}!"
    }
}
