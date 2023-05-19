package com.example.makeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Four : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

         lateinit var webView: WebView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        webView = findViewById(R.id.Viewssss)

        webView.settings.javaScriptEnabled = true

        webView.loadUrl("https://www.sephora.com")
    }
}