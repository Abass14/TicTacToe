package com.example.tictactoeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tictactoeapp.utils.NavigationFunctions

class MenuActivity : AppCompatActivity() {
    lateinit var singlePlayer: Button
    lateinit var multiPlayer: Button
    lateinit var leaderBoard: Button
    lateinit var exit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        //Menu Button Views
        singlePlayer = findViewById(R.id.singlePlayer)
        multiPlayer = findViewById(R.id.multiplayer)
        leaderBoard = findViewById(R.id.leaderboard)
        exit = findViewById(R.id.exit)

        //exit button to kill app
        exit.setOnClickListener {
            NavigationFunctions.exit(this)
        }

        //Onclick listener to navigate to singlePlayer Activity
        singlePlayer.setOnClickListener {
            NavigationFunctions.navigateSinglePlayer(this)
        }

        //Onclick listener to navigate to multiPlayer Activity
        multiPlayer.setOnClickListener {
            NavigationFunctions.navigateLoginMultiPLayer(this)
        }

    }

    override fun onBackPressed() {
        finishAffinity()
        finish()
    }

}