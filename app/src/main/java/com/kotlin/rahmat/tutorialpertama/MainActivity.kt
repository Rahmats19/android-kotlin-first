package com.kotlin.rahmat.tutorialpertama

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import es.dmoral.toasty.Toasty

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var uName = findViewById(R.id.et_user_name) as EditText
        var uPassword = findViewById(R.id.et_password) as EditText
        var uButton = findViewById(R.id.btn_submit) as Button

        uButton.setOnClickListener{
            val message = "username: " + uName.text + " password: " + uPassword.text;
            //Toast.makeText(this, "username : " + username + " password : " + password, Toast.LENGTH_LONG).show()
            Toasty.success(this,message,Toast.LENGTH_SHORT ).show()
        }
    }

}
