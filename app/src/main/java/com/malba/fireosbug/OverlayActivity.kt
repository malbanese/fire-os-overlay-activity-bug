package com.malba.fireosbug

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.customtabs.CustomTabsIntent

class OverlayActivity : AppCompatActivity() {
    private fun openBrowser(browserType: BrowserType) {
        Log.d(TAG, "openBrowser: $browserType")
        val url = "https://browserbench.org/Speedometer2.0/"

        when (browserType) {
            BrowserType.ActionView -> {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }

            BrowserType.CustomTabs -> {
                val intent = CustomTabsIntent.Builder()
                    .build()
                intent.launchUrl(this, Uri.parse(url))
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_overlay)

        val browserType = BrowserType.values()[intent.getIntExtra(EXTRA_BROWSER_TYPE, 0)]
        val button = findViewById<TextView>(R.id.button)
        val parent = button.parent as View

        button.text = when (browserType) {
            BrowserType.ActionView -> getString(R.string.open_view_intent)
            BrowserType.CustomTabs -> getString(R.string.open_custom_tabs)
        }

        parent.setOnClickListener {
            Toast.makeText(this, "You clicked me!", Toast.LENGTH_LONG).show()
        }

        button.setOnClickListener {
            openBrowser(browserType)
        }
    }

    enum class BrowserType {
        ActionView,
        CustomTabs
    }

    companion object {
        private const val TAG = "OverlayActivity"
        private const val EXTRA_BROWSER_TYPE = "extra_browser_type"
        fun create(context: Context, type: BrowserType) =
            Intent(context, OverlayActivity::class.java).apply {
                putExtra(EXTRA_BROWSER_TYPE, type.ordinal)
            }
    }
}