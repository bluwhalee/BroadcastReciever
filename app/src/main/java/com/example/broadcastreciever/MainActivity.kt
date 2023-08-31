package com.example.broadcastreciever

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private val airPlaneModeReciever = AirPlaneModeReciever()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        registerReceiver(
            airPlaneModeReciever,
            IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        )

        setContentView(R.layout.activity_main)
    }
}