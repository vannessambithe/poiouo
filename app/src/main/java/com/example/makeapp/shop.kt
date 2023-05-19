package com.example.makeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Shop : AppCompatActivity() {
    private lateinit var ardone: ImageView
    private lateinit var ardtwo: ImageView
    private lateinit var ardthree: ImageView
    private lateinit var ardfour: ImageView
    private lateinit var entalbtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        ardone = findViewById(R.id.ivProducts)
        ardtwo = findViewById(R.id.ivShop)
        ardthree = findViewById(R.id.ivPayment)
        ardfour = findViewById(R.id.ivLogOut)
        entalbtn = findViewById(R.id.back)





        ardone.setOnClickListener{
            var gotocardio = Intent(this,One::class.java)
            startActivity(gotocardio)

        }

        ardtwo.setOnClickListener{
            var gotofull = Intent(this,Two::class.java)
            startActivity(gotofull)

        }

        ardthree.setOnClickListener{
            var gotostretch = Intent(this,Three::class.java)
            startActivity(gotostretch)

        }

        ardfour.setOnClickListener{
            var gotostrength = Intent(this,Four::class.java)
            startActivity(gotostrength)

        }
        entalbtn.setOnClickListener{
            var gotohome = Intent(this,Dashboard::class.java)
            startActivity(gotohome)}


    }
}