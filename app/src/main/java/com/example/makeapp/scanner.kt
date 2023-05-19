package com.example.makeapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class  Scanner : AppCompatActivity() {

    private lateinit var cardone: LinearLayout
    private lateinit var cardtwo:LinearLayout
    private lateinit var cardthree:LinearLayout
    private lateinit var cardfour:LinearLayout
    private lateinit var mentalbtn: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scanner)

        cardone = findViewById(R.id.card_one)
        cardtwo = findViewById(R.id.card_two)
        cardthree = findViewById(R.id.card_three)
        cardfour = findViewById(R.id.card_four)
        mentalbtn = findViewById(R.id.backButton)





        cardone.setOnClickListener{
            var gotocardio = Intent(this,face::class.java)
            startActivity(gotocardio)

        }

        cardtwo.setOnClickListener{
            var gotofull = Intent(this,hair::class.java)
            startActivity(gotofull)

        }

        cardthree.setOnClickListener{
            var gotostretch = Intent(this,lips::class.java)
            startActivity(gotostretch)

        }

        cardfour.setOnClickListener{
            var gotostrength = Intent(this,legs::class.java)
            startActivity(gotostrength)

        }
        mentalbtn.setOnClickListener{
            var gotohome = Intent(this,Dashboard::class.java)
            startActivity(gotohome)}
    }
}