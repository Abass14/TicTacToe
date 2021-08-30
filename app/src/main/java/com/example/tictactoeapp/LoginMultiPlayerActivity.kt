package com.example.tictactoeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.tictactoeapp.utils.NavigationFunctions
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase

class LoginMultiPlayerActivity : AppCompatActivity() {
    lateinit var email: AppCompatEditText
    lateinit var password: AppCompatEditText
    lateinit var loginBtn: Button
    private var auth: FirebaseAuth? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_multi_player)

        //initializing views
        email = findViewById(R.id.emailTxt)
        password = findViewById(R.id.passwordTxt)
        loginBtn = findViewById(R.id.loginBtn)

        //initializing firebase authentication
        auth = FirebaseAuth.getInstance()

        loginBtn.setOnClickListener {
            buttonLoginEvent()
        }
    }

    fun buttonLoginEvent(){
        loginToFirebase(email.text.toString(), password.text.toString())
    }

    override fun onStart() {
        super.onStart()
        NavigationFunctions.navigateMultiPlayer(this, auth!!.currentUser)
    }

    fun loginToFirebase(email: String, password: String){
        auth?.createUserWithEmailAndPassword(email, password)
            ?.addOnCompleteListener {
                if (it.isSuccessful){
                    Toast.makeText(this, "Successful login", Toast.LENGTH_SHORT).show()
                    NavigationFunctions.databaseRef.child("Users").child(splitString(auth!!.currentUser?.email.toString())).setValue(auth!!.currentUser?.uid)
                    NavigationFunctions.navigateMultiPlayer(this, auth!!.currentUser)
                }else{
                    Toast.makeText(this, "Login failed ", Toast.LENGTH_SHORT).show()
                }
            }
    }

    fun splitString(str: String) : String{
        val split = str.split("@")
        return split[0]
    }
}