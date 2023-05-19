package com.example.makeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class hair : AppCompatActivity() {


    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hair)

        webView = findViewById(R.id.webViews)

        webView.settings.javaScriptEnabled = true

        webView.loadUrl("https://gisou.com/blogs/blog/hair-care-routine-steps")

    }
}