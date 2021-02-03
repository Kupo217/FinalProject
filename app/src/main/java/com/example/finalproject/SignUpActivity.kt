package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_3.*
import kotlinx.android.synthetic.main.activity_main.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        init()
    }
    fun init(){
        sign_up.setOnClickListener() {
            val intent = Intent()     //აქ ჩასაწერია შემდეგი ექთივითის სახელი
            val name = name_edit_text.toString()
            val email = email_text.toString()
            val password = pass_text.toString()
            val pass2 = repeat_pass.toString()
            if (name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty() && pass2.isNotEmpty()) {
                if (isEmailValid(email)) {
                    if (password == pass2) {
                        startActivity(intent)
                    }
                } else {
                    Toast.makeText(this, "Email format isn't correct!", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please fill all the fields!", Toast.LENGTH_SHORT).show()
            }
        }
        sign_in_txt.setOnClickListener() {
            val intent = Intent(this,SignInActivity::class.java)
            startActivity(intent)
        }
    }
    private fun isEmailValid(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}