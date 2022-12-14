// Created by 超悟空 on 2021/4/16.

package com.latitech.whiteboardsdkdemo

import android.app.Application
import com.latitech.whiteboard.WhiteBoard

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        WhiteBoard.init(this, BuildConfig.DEBUG)

        WhiteBoard.setDefaultInputMode(NormalPenStyle().inputConfig)
    }
}