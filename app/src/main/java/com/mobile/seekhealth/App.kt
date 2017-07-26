package com.mobile.seekhealth

import android.app.Application
import com.mobile.seekhealth.dagger.AppComponent
import com.mobile.seekhealth.dagger.AppModule

class App: Application() {
    companion object{
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        appComponent =  DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

}