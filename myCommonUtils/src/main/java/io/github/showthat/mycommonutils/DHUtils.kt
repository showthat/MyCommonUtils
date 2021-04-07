package io.github.showthat.mycommonutils

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun String.toDate(): Date? {

    val format = SimpleDateFormat("yyyy-MM-dd")

    return format.parse(this)
}