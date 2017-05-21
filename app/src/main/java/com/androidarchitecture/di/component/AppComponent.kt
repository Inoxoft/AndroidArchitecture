package com.androidarchitecture.di.component

import android.content.Context
import com.androidarchitecture.data.UserDataSource
import com.androidarchitecture.di.module.AppModule
import com.androidarchitecture.di.module.DataModule
import dagger.Component
import javax.inject.Singleton
import com.androidarchitecture.core.executor.ThreadExecutor
import com.androidarchitecture.view.activity.LoginActivity


/**
 * Created by binary on 5/18/17.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class, DataModule::class))
interface AppComponent {

    fun getContext() : Context

    fun threadExecutor(): ThreadExecutor

    fun userDataSource(): UserDataSource

    fun inject(loginActivity: LoginActivity)
}