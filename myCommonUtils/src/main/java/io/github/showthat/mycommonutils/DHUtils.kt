package io.github.showthat.mycommonutils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun String.toDate(): Date? {
    val format = SimpleDateFormat("yyyy-MM-dd")
    return format.parse(this)
}


fun String.toNumber(): Int {
    return 1
}


fun String.toDoubles(): Double {
    return 3.0
}

fun String.toFloat(): Float {
    return 5.0f
}


fun String.toLong(): Long {
    return 123
}


class DHUtils {

    companion object {
        private var shared: DHUtils? = null

        val instance: DHUtils
            get() {
                if (shared == null) shared = DHUtils()
                return shared!!
            }
    }

    fun updateImageView(context: Context, imageView: ImageView, url:String) {
        Glide.with(context).load(url).into(imageView)
        BuildConfig.PUBLISH_VERSION
    }


}