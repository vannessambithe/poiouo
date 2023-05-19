package com.example.makeapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class face : AppCompatActivity() {

    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_face)

        webView = findViewById(R.id.webView)
        webView.settings.javaScriptEnabled = true // Enable JavaScript if required

        webView.webViewClient = WebViewClient()


        webView.loadUrl("https://www.dermstore.com/blog/in-what-order-do-i-apply-my-skin-care-products-infographic/")
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        // Handle back button press within the WebView
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
