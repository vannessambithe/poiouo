package com.example.makeapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Two : AppCompatActivity() {
    private lateinit var webView: WebView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        webView = findViewById(R.id.Viewss)

        webView.settings.javaScriptEnabled = true

        webView.loadUrl("https://wholesale.stylekorean.com")
    }
}