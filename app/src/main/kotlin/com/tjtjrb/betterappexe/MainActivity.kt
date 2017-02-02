package com.tjtjrb.betterappexe

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : Activity() {
    private var fancyButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fancyButton = findViewById(R.id.fancy_button) as Button

        fancyButton!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                Toast.makeText(getApplicationContext(), "Good Job, Yo", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
