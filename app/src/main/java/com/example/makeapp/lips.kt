package com.example.makeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class lips : AppCompatActivity() {

    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lips)


        webView = findViewById(R.id.webViewsss)

        webView.settings.javaScriptEnabled = true

        webView.loadUrl("https://www.healthline.com/health/lip-care-routine")

    }
}