package com.malba.fireosbug

import android.app.Application
import android.util.Log

class Application : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate")
        registerActivityLifecycleCallbacks(ActivityLifecycleLogger())
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Log.d(TAG, "onLowMemory")
    }

    override fun onTerminate() {
        super.onTerminate()
        Log.d(TAG, "onTerminate")
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        Log.d(TAG, "onTrimMemory")
    }

    companion object {
        private const val TAG = "Application"
    }
}