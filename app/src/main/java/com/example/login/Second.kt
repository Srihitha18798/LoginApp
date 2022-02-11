package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle: Bundle?=intent.extras
        val name=bundle?.getString("username")
        val lable=findViewById<TextView>(R.id.lbl_name)
        lable.text="Welcome "+name.toString();
    }

}