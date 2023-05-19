package com.example.makeapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.firebase.database.core.view.View

class Dashboard : AppCompatActivity() {


    private lateinit var cardone: CardView
    private lateinit var cardtwo: LinearLayout
    private lateinit var cardthree: LinearLayout
    private lateinit var cardfour: LinearLayout
    @SuppressLint("MissingInflatedId", "VisibleForTests")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        cardone = findViewById(R.id.edt_home)
        cardtwo = findViewById(R.id.edt_shop)
        cardthree = findViewById(R.id.edt_profile)
        cardfour = findViewById(R.id.edt_payment)



        cardone.setOnClickListener {
            val gotohome = Intent(this,Scanner::class.java)
            startActivity(gotohome)
        }
        cardtwo.setOnClickListener {
            val gotoshop = Intent(this,Shop::class.java)
            startActivity(gotoshop)
        }
        cardthree.setOnClickListener {
            val gotoprofile = Intent(this,MainActivity::class.java)
            startActivity(gotoprofile)
        }
        cardfour.setOnClickListener {
            val gotomainn = Intent(this,Quiz::class.java)
            startActivity(gotomainn)

        }
    }
}


