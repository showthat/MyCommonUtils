package com.hoons.mycommonutils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.showthat.mycommonutils.toDate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("".toDate())
        print("2020-11-01".toDate())
    }
}