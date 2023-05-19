package com.example.makeapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class One : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var webView: WebView


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
        webView = findViewById(R.id.Vie)

        webView.settings.javaScriptEnabled = true

        webView.loadUrl("https://www.beautyclick.co.ke")
    }
}