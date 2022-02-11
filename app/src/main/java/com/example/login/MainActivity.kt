package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.btn_login)
        val username = findViewById<EditText>(R.id.txt_username)
        val password = findViewById<EditText>(R.id.txt_password)
        button1.setOnClickListener {

            val name = username.text.toString()
            val pwd = password.text.toString()
            val intent = Intent(this, Second::class.java)
            intent.putExtra("username", name)
            intent.putExtra("password", pwd)
            startActivity(intent)
        }


        btn_share.setOnClickListener {

            val message = "My username is : " + txt_username.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Select An App:"))
        }
    }
}

