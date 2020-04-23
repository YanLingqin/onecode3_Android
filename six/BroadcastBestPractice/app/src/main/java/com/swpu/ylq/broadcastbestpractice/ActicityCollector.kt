package com.swpu.ylq.broadcastbestpractice

import android.app.Activity

/**
 *   用于管理所有的Activity
 */
object ActicityCollector {
    private val activities=ArrayList<Activity>()

    fun addActivity(activity: Activity){
        activities.add(activity)
    }

    fun removeActivity(activity: Activity){
        activities.remove(activity)
    }

    fun finishAll(){
        for (activity in activities){
            if(activity.isFinishing){
                activity.finish()
            }
        }
        activities.clear()
    }
}