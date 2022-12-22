package com.example.sortbab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val los = findViewById<Button>(R.id.losuj);
        val sor = findViewById<Button>(R.id.sortuj);
        val text = findViewById<TextView>(R.id.textView);

        var list1 = arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0)
        var list2: Array<Switch> = arrayOf(findViewById(R.id.s1), findViewById(R.id.s2), findViewById(R.id.s3), findViewById(R.id.s4), findViewById(R.id.s5), findViewById(R.id.s6), findViewById(R.id.s7), findViewById(R.id.s8), findViewById(R.id.s9),)
    }
}