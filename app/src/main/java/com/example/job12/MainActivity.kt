package com.example.job12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val intent1 = Intent(this, hal1::class.java)
            startActivity(intent1)
        }
        var button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent1 = Intent(this, hal2::class.java)
            startActivity(intent1)
        }

    }
}
