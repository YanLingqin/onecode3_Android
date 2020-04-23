package com.swpu.ylq.broadcasttest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BootCompleteReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
       Toast.makeText(context,"Boot complete",Toast.LENGTH_LONG).show()
    }
}
