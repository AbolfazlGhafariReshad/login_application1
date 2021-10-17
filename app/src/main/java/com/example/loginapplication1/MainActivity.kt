package com.example.loginapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val f1 = findViewById<FrameLayout>(R.id.ac_main_frame1)
        val f2 = findViewById<FrameLayout>(R.id.ac_main_frame2)
        val btn1 = findViewById<Button>(R.id.ac_main_btnsub)
        val txt1 = findViewById<EditText>(R.id.ac_main_txtphone)
        val btn2 = findViewById<Button>(R.id.ac_main_btnvrod)
        val btn3 = findViewById<Button>(R.id.ac_main_btnback)

        btn1.setOnClickListener {

                if (txt1.text.length == 11) {
                   f1.visibility = View.GONE
                   f2.visibility = View.VISIBLE
                }else
                    Toast.makeText(this, "شماره وارد نشده یا صحیح نیست", Toast.LENGTH_SHORT).show()

        }

        btn3.setOnClickListener {

            f2.visibility=View.GONE
            f1.visibility=View.VISIBLE

        }



    }
}