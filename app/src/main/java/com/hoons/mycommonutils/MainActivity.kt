package com.hoons.mycommonutils

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.mobon.adfit_sdk.AdfitAdapter
import com.mobon.sdk.BannerType
import com.mobon.sdk.MobonSDK
import com.mobon.sdk.RectBannerView
import com.mobon.sdk.callback.iMobonBannerCallback
import io.github.showthat.dhstringutils.forFloat
import io.github.showthat.mycommonutils.*
import io.github.showthat.mycommonutils.BuildConfig

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.d("my", "" + "".toNumber())
        Log.d("my", "" + "2020-11-01".toDate())
        Log.d("my", "" + "".toFloat())
        Log.d("my", "" + "".toNumber())

        val thumbnail =  findViewById<ImageView>(R.id.imageViewThumbnail)
        DHUtils.instance.updateImageView(this, thumbnail, "https://i.pinimg.com/originals/b0/d6/70/b0d670e21a8378565038c44bdd4ded7d.jpg")

        MobonSDK(this, "mobon")

        val banner_container = findViewById<LinearLayout>(R.id.viewForAD)

        var rv = RectBannerView(this, BannerType.BANNER_320x50).setBannerUnitId("484613")
        rv.setAdListener(object: iMobonBannerCallback {
            override fun onLoadedAdInfo(success: Boolean, errorCode: String?) {
                if (success) {
                    Log.d("my", "배너 광고 로딩")
                    //광고를 띄울 View에 추가...
                    banner_container.addView(rv)
                }
                else {
                    Log.d("my", "광고 실패 $errorCode")
                    rv.destroyAd()
                    rv = null
                }
            }

            override fun onAdClicked() {
                Log.d("my", "광고 클릭")
            }

        })

        rv.loadAd()
    }
}