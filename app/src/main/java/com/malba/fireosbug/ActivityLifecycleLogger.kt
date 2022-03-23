package com.malba.fireosbug

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log

class ActivityLifecycleLogger : Application.ActivityLifecycleCallbacks {
    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        Log.d(TAG, "${activity.localClassName} onActivityCreated")
    }

    override fun onActivityStarted(activity: Activity) {
        Log.d(TAG, "${activity.localClassName} onActivityStarted")
    }

    override fun onActivityResumed(activity: Activity) {
        Log.d(TAG, "${activity.localClassName} onActivityResumed")
    }

    override fun onActivityPaused(activity: Activity) {
        Log.d(TAG, "${activity.localClassName} onActivityPaused")
    }

    override fun onActivityStopped(activity: Activity) {
        Log.d(TAG, "${activity.localClassName} onActivityStopped")
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
        Log.d(TAG, "${activity.localClassName} onActivitySaveInstanceState")
    }

    override fun onActivityDestroyed(activity: Activity) {
        Log.d(TAG, "${activity.localClassName} onActivityDestroyed")
    }

    companion object {
        private const val TAG = "ActivityLifecycleLogger"
    }
}