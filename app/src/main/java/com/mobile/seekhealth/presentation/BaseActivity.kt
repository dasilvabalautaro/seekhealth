package com.mobile.seekhealth.presentation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mobile.seekhealth.R

abstract class BaseActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}