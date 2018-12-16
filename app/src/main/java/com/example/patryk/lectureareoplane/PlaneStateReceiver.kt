package com.example.patryk.lectureareoplane

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class PlaneStateReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
       Toast.makeText(context,"Zmieniono stan",Toast.LENGTH_LONG).show()
    }
}