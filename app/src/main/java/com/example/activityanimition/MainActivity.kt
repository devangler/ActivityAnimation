package com.example.activityanimition

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn=findViewById(R.id.button)
        btn.setOnClickListener {
            val intent=Intent(this,NextActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out)
        }


    }
}

