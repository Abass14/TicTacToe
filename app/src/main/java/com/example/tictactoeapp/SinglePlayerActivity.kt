package com.example.tictactoeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.example.tictactoeapp.utils.NavigationFunctions

class SinglePlayerActivity : AppCompatActivity() {
    lateinit var b1: Button
    lateinit var b2: Button
    lateinit var b3: Button
    lateinit var b4: Button
    lateinit var b5: Button
    lateinit var b6: Button
    lateinit var b7: Button
    lateinit var b8: Button
    lateinit var b9: Button
    lateinit var playerOneScore: TextView
    lateinit var playerTwoScore: TextView
    lateinit var exitGame: ImageButton
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var playerOneWinsCount = 0
    var playerTwoWinsCount = 0
    var activePlayer = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_player)

        //initializing game buttons
        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        b4 = findViewById(R.id.b4)
        b5 = findViewById(R.id.b5)
        b6 = findViewById(R.id.b6)
        b7 = findViewById(R.id.b7)
        b8 = findViewById(R.id.b8)
        b9 = findViewById(R.id.b9)
        exitGame = findViewById(R.id.exit_game)

        exitGame.setOnClickListener {
            onBackPressed()
        }

    }

    fun clickBtn(view: View) {

    }
}