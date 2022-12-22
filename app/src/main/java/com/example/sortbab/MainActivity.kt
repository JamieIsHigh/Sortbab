package com.example.sortbab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import java.util.Collections.swap
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
        fun sort(arr: MutableList<Int>): MutableList<Int> {
            var swappedElements : Boolean
            var level = arr.size - 1
            do {
                swappedElements = false
                for (i in 0..level - 1){
                    if (arr[i] > arr[i + 1]){
                        swap(arr, i, i + 1)
                        swappedElements = true
                    }
                }
                level--
            } while (swappedElements)
            return arr
        }
        los.setOnClickListener {
            for (i in 0..8) {
                var ran = Random.nextInt(1, 9);
                list1[i] = ran
                list2[i].text = ran.toString();
            }
            text.text = "TextWidze"
        }

        sor.setOnClickListener {
            var wartoscidobre = mutableListOf<Int>(0, 0, 0, 0, 0, 0, 0, 0, 0)
            var licznik = 0
            var  zero = 0
            text.text = ""
            for (i in 0..8) {
                if (list2[i].isChecked == true) {
                    licznik += 1;
                    wartoscidobre[licznik - 1] = list1[i];
                }
            }
            for (i in 0..8)
                wartoscidobre.remove(0)
            text.text = sort(wartoscidobre).toString()

        }

    }
}