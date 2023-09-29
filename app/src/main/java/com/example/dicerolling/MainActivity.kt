package com.example.dicerolling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImg : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollBtn)
        rollButton.setOnClickListener {
            rollDice();
        }
    }
        private fun rollDice() {
            diceImg = findViewById(R.id.imgOfDice)
            var randomImg: Int = Random().nextInt(6)+1
            val drawableRes=when(randomImg)
            {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImg.setImageResource(drawableRes)
        }
    }
