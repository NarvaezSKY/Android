package com.example.yocuando

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    //lateinit var  cadena :String;





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      findViewById<Button>(R.id.button).setOnClickListener{
          Toast.makeText(this, "has ingresao tio", Toast.LENGTH_SHORT).show()
      }



    }
}