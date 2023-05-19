package com.example.makeapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth



class MainActivity : AppCompatActivity() {

    private lateinit var edtsignup: TextView
    private lateinit var edtlogin: TextView
    private lateinit var loginlayout: LinearLayout
    private lateinit var signuplayout: LinearLayout
    private lateinit var signinn: Button
    private lateinit var register: Button
    private lateinit var email: TextInputEditText
    private lateinit var pass0ne: TextInputEditText
    private lateinit var email2: TextInputEditText
    private lateinit var passtwo: TextInputEditText
    private lateinit var passcom: TextInputEditText
    private lateinit var forgot: TextView


    private lateinit var auth: FirebaseAuth

    @SuppressLint("UseCompatLoadingForDrawables", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtlogin = findViewById(R.id.signUp)
        edtsignup = findViewById(R.id.logIn)
        signuplayout = findViewById(R.id.Signup_layout)
        loginlayout = findViewById(R.id.login_layout)
        signinn = findViewById(R.id.signIn)
        email = findViewById(R.id.eMail)
        pass0ne = findViewById(R.id.password)
        email2 = findViewById(R.id.eMails)
        passtwo = findViewById(R.id.passwords)
        passcom = findViewById(R.id.passwordss)
        forgot = findViewById(R.id.fgs_pass)
        register= findViewById(R.id.Register)


        auth = FirebaseAuth.getInstance()


        edtsignup.setOnClickListener {
            edtsignup.background = resources.getDrawable(R.drawable.switch_tricks, null)
            edtsignup.setTextColor(resources.getColor(R.color.textColor, null))
            edtlogin.background = null
            signuplayout.visibility = View.VISIBLE
            register.visibility = View.VISIBLE
            loginlayout.visibility = View.GONE
            signinn.visibility = View.GONE
            edtlogin.setTextColor(resources.getColor(R.color.transparentColor, null))

        }
        edtlogin.setOnClickListener {
            edtsignup.background = null
            edtsignup.setTextColor(resources.getColor(R.color.textColor, null))
            edtlogin.background = resources.getDrawable(R.drawable.switch_tricks, null)
            signuplayout.visibility = View.GONE
            loginlayout.visibility = View.VISIBLE
            signinn.visibility = View.VISIBLE
            register.visibility = View.GONE
            edtlogin.setTextColor(resources.getColor(R.color.textColor, null))

        }
        forgot.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }



        signinn.setOnClickListener {
            val email = email.text.toString().trim()
            val password = pass0ne.text.toString().trim()

            if (email.isNotEmpty() && password.isNotEmpty()) {


                auth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful) {
                        val intent = Intent(this, Dashboard::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "Empty fields not allowed", Toast.LENGTH_SHORT).show()
            }







            register.setOnClickListener {
                val emails = email2.text.toString().trim()
                val passwords = passtwo.text.toString().trim()
                val compass = passcom.text.toString().trim()

                if (emails.isNotEmpty() && passwords.isNotEmpty() && compass.isNotEmpty()) {
                    if (passwords == compass) {

                        auth.createUserWithEmailAndPassword(emails, passwords).addOnCompleteListener {
                            if (it.isSuccessful) {
                                val intent = Intent(this, Dashboard::class.java)
                                startActivity(intent)
                            } else {
                                Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT)
                                    .show()
                            }
                        }
                    } else {
                        Toast.makeText(this, "password is not matching", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this, "Empty Fields not allowed!!", Toast.LENGTH_SHORT).show()
                }


            }


        }
    }
}































