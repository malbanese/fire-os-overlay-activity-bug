package com.malba.fireosbug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<TextView>(R.id.button_view_intent).setOnClickListener {
            startActivity(
                OverlayActivity.create(this, OverlayActivity.BrowserType.ActionView)
            )
        }

        findViewById<TextView>(R.id.button_custom_tabs).setOnClickListener {
            startActivity(
                OverlayActivity.create(this, OverlayActivity.BrowserType.CustomTabs)
            )
        }
    }
}