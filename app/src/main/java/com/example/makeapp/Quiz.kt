package com.example.makeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Quiz : AppCompatActivity() {

    private lateinit var websss : WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        websss = findViewById(R.id.webs)

        websss.settings.javaScriptEnabled = true

        websss.loadUrl("https://toastyfrenchfries.quora.com/which-beauty-standard-do-I-fit-the-most-Apparently-i-fit-the-Italian-beauty-standard-the-most-btw-I-dont-have")
    }
}