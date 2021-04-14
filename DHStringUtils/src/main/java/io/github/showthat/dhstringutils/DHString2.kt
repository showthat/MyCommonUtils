package io.github.showthat.dhstringutils

import java.text.SimpleDateFormat
import java.util.*

fun String.forDate(): Date? {
    val format = SimpleDateFormat("yyyy-MM-dd")
    return format.parse(this)
}


fun String.forNumber(): Int {
    return 1
}


fun String.forDoubles(): Double {
    return 3.0
}

fun String.forFloat(): Float {
    return 5.0f
}


fun String.forLong(): Long {
    return 123
}
