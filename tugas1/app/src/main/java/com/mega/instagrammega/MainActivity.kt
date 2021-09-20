package com.mega.instagrammega

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_follow = findViewById<TextView>(R.id.button)
        val con_follow = findViewById<TextView>(R.id.textView2)

        btn_follow.setOnClickListener {
            con_follow.text = "1.866"
            btn_follow.text = "Following"
        }
    }
}