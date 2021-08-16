package com.example.learningkotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

// Any sort of screen inside our app is an activity
// I always have to write code in a function
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Make info text view Invisible when the app starts
        infoTextView.visibility = View.INVISIBLE
        // whenever Calculate button is hit to stuff
        calculateButton.setOnClickListener {

            val bill = billEditText.text.toString().toDouble()
            val tipPercentage = tipPercentageEditText.text.toString().toDouble()
            val tip = tipPercentage * 0.01 * bill
            val total = tip + bill

            // set info text to visible again
            infoTextView.visibility = View.VISIBLE



            infoTextView.text = "Tip: \$${String.format("%.2f", tip)}   Total: \$${String.format("%.2f", total)}"
        }

    }
}