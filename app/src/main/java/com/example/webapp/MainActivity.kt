package com.example.webapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<WebView>(R.id.webview)
        webViewSetup(view)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup(view: WebView){
        view.webViewClient = WebViewClient()
        view.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled= true
            loadUrl("https://tejprakash18.github.io/githubWrapper/")
        }

    }
}