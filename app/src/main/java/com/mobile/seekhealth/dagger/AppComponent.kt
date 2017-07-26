package com.mobile.seekhealth.dagger

import com.mobile.seekhealth.presentation.BaseActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(mainActivity: BaseActivity)
}