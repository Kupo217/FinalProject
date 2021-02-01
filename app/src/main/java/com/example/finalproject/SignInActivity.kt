package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_3.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.login

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        init()
    }
    fun init(){
        login.setOnClickListener(){
            val intent = Intent()
            val email = email_edit_text.toString()
            val password = pass_edit_text.toString()
            if (email.isNotEmpty() && password.isNotEmpty()){
                startActivity(intent)}
            else{
                Toast.makeText(this, "Please, fill all the fialds!", Toast.LENGTH_SHORT).show()
            }

        }
        sign_up1.setOnClickListener(){
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}