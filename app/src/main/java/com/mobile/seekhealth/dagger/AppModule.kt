package com.mobile.seekhealth.dagger

import android.content.Context
import com.mobile.seekhealth.model.UserRegisterFirebase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val context: Context) {
    @Provides
    @Singleton
    fun provideUserRegister(): UserRegisterFirebase{
        return UserRegisterFirebase(context)
    }
}