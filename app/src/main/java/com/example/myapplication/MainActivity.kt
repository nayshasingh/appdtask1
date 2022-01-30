package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name: EditText = findViewById(R.id.name)
        val btn: Button = findViewById(R.id.btn_submit)
        btn.setOnClickListener(View.OnClickListener {
            if (name.length() == 0) {
                Toast.makeText(this, "please enter your name", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "hi ${name.text} go corona go !", Toast.LENGTH_SHORT).show()
            }
        })
    }}
