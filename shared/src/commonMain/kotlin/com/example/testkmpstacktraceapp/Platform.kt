package com.example.testkmpstacktraceapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform