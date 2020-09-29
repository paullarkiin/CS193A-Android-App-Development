package com.auth0.whohigher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    private var points = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pickRandomNumbers()

        fun leftButtonClick(view: View) {
            val leftButton = findViewById<Button>(R.id.leftButton)
            val rightButton = findViewById<Button>(R.id.rightButton)
            val leftNum = leftButton.text.toString().toInt()
            val rightNum = rightButton.text.toString().toInt()

            if (leftNum > rightNum) {
                points++
            } else {
                points--
            }

            findViewById<TextView>(R.id.score).text = "$points"
            pickRandomNumbers()
        }

        fun rightButtonClick(view: View) {
            val leftButton = findViewById<Button>(R.id.leftButton)
            val rightButton = findViewById<Button>(R.id.rightButton)
            val leftNum = leftButton.text.toString().toInt()
            val rightNum = rightButton.text.toString().toInt()

            if (rightNum > leftNum) {
                points++
            } else {
                points--
            }

            findViewById<TextView>(R.id.score).text = "$points"
            pickRandomNumbers()
        }
    }

    private fun pickRandomNumbers() {
        val leftButton = findViewById<Button>(R.id.leftButton)
        val rightButton = findViewById<Button>(R.id.rightButton)

        // this is using java.util.* not kotlin random
        val r = Random()

        // creating new random numbers between 1 - 20
        val num1 = r.nextInt(20)
        val num2 = r.nextInt(20)

        // $ display the number by converting to a string from an int
        leftButton.text = "$num1"
        rightButton.text = "$num2"
    }

}

