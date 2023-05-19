package com.example.makeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class legs : AppCompatActivity() {

    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legs)


        webView = findViewById(R.id.webViewss)

        webView.settings.javaScriptEnabled = true

        webView.loadUrl("https://legology.co.uk/the-best-skincare-routine-for-your-legs/")


    }
}