package com.example.areyouhigher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val leftButton: Button = findViewById(R.id.leftButton)
        val rightButton: Button = findViewById(R.id.rightButton)

        leftButton.setOnClickListener {
            pickRandNums()
        }

        rightButton.setOnClickListener {
            pickRandNums()
        }
    }
    private fun pickRandNums() {

        var points = 0
        val leftButtonAction = findViewById<Button>(R.id.leftButton)
        val rightButtonAction = findViewById<Button>(R.id.rightButton)
        val leftNum = leftButton.text.toString().toInt()
        val rightNum = rightButton.text.toString().toInt()

        val num1 = Random.nextInt(20)
        val num2 = Random.nextInt(20)

        leftButtonAction.text = "$num1"
        rightButtonAction.text = "$num2"

        if (leftNum > rightNum){
            points++
        } else {
            points--
        }

        findViewById<TextView>(R.id.updateScore).text = "$points"


    }
}
