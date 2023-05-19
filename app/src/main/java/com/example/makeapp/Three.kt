package com.example.makeapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Three : AppCompatActivity() {
    private lateinit var webView: WebView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        webView = findViewById(R.id.Viewsss)

        webView.settings.javaScriptEnabled = true

        webView.loadUrl("https://www.dreamskinhaven.co.ke")
    }
}