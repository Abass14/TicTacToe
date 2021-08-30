package com.example.tictactoeapp.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.core.app.ActivityCompat.finishAffinity
import androidx.core.content.ContextCompat.startActivity
import com.example.tictactoeapp.LoginMultiPlayerActivity
import com.example.tictactoeapp.MenuActivity
import com.example.tictactoeapp.MultiPlayerActivity
import com.example.tictactoeapp.SinglePlayerActivity
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.FirebaseDatabase

object NavigationFunctions {

    var database = FirebaseDatabase.getInstance()
    var databaseRef = database.reference
    //function to navigate splashScreen
    fun navigateSplashScreen(context: Context){
        val intent = Intent(context, MenuActivity::class.java)
        context.startActivity(intent)
    }


    fun navigateLoginMultiPLayer(context: Context){
        val intent = Intent(context, LoginMultiPlayerActivity::class.java)
        context.startActivity(intent)
    }

    //function to navigate to singlePlayer
    fun navigateSinglePlayer(context: Context){
        val intent = Intent(context, SinglePlayerActivity::class.java)
        context.startActivity(intent)
    }

    //function to navigate to multiplayer
    fun navigateMultiPlayer(context: Context, currentUser: FirebaseUser?){
        if (currentUser != null){

            //save in database
//                databaseRef.child("Users").child(currentUser.uid).setValue(currentUser.email)
            val intent = Intent(context, MultiPlayerActivity::class.java)
            intent.putExtra("email", currentUser.email)
            intent.putExtra("id", currentUser.uid)
            context.startActivity(intent)
        }
    }

    fun exit(activity: Activity){
        activity.finishAffinity()
        activity.finish()
    }

}