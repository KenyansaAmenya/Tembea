package com.kenyansa.tembea

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform