package com.example.dokkaflavorbugdemo

import android.util.Log
import com.example.dokkaflavorbugdemo.model.DemoRequest
import com.example.dokkaflavorbugdemo.model.DemoResult

interface ConnectionManager {
    fun connect(demoRequest: DemoRequest): DemoResult
}

internal class ConnectionManagerImpl() : ConnectionManager{
    override fun connect(demoRequest: DemoRequest): DemoResult {
        Log.d("Tag","Connect to dev")
        return DemoResult("Dev")
    }
}