package com.example.bridgingdemo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bridginglibrarydemo.Counter

class MainActivity : AppCompatActivity() {
    private var count = 0
    private var counter = Counter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvCount = findViewById<TextView>(R.id.tvCount)
        val btnCountIncrease = findViewById<Button>(R.id.btnCountIncrease)
        val btnCountDecrease = findViewById<Button>(R.id.btnCountDecrease)
        tvCount.text = "$count"
        btnCountIncrease.setOnClickListener{
            count = counter.countIncrease()
            tvCount.text = "$count"
        }

        btnCountDecrease.setOnClickListener{
            count = counter.countIncrease()
            tvCount.text = "$count"
        }
    }
}