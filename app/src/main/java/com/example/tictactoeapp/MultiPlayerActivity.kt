package com.example.tictactoeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import com.example.tictactoeapp.utils.NavigationFunctions
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.FirebaseDatabaseKtxRegistrar
import com.google.firebase.ktx.Firebase
import org.w3c.dom.Text

class MultiPlayerActivity : AppCompatActivity() {
    private lateinit var analytics: FirebaseAnalytics
    private var database = FirebaseDatabase.getInstance()
    lateinit var b1: Button
    lateinit var b2: Button
    lateinit var b3: Button
    lateinit var b4: Button
    lateinit var b5: Button
    lateinit var b6: Button
    lateinit var b7: Button
    lateinit var b8: Button
    lateinit var b9: Button
    lateinit var requestEmail: EditText
    lateinit var requestBtn: Button
    lateinit var acceptBtn: Button
    lateinit var playerOneScoreOnline: TextView
    lateinit var playerTwoScoreOnline: TextView
    lateinit var exitBtn: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_player)

        //initializing views
        b1 = findViewById(R.id.b1_online)
        b2 = findViewById(R.id.b2_online)
        b3 = findViewById(R.id.b3_online)
        b4 = findViewById(R.id.b4_online)
        b5 = findViewById(R.id.b5_online)
        b6 = findViewById(R.id.b6_online)
        b7 = findViewById(R.id.b7_online)
        b8 = findViewById(R.id.b8_online)
        b9 = findViewById(R.id.b9_online)
        requestEmail = findViewById(R.id.requestEmail)
        requestBtn = findViewById(R.id.requestBtn)
        acceptBtn = findViewById(R.id.acceptBtn)
        playerOneScoreOnline = findViewById(R.id.playerOneScore_online)
        playerTwoScoreOnline = findViewById(R.id.playerTwoScore_online)
        exitBtn = findViewById(R.id.exit_game_online)

        //initializing Firebase analytics
        analytics = Firebase.analytics

        exitBtn.setOnClickListener {
            NavigationFunctions.navigateSplashScreen(this)
        }
    }

    fun clickBtnOnline(view: View) {

    }
}