package com.example.dokkaflavorbugdemo

import android.util.Log
import com.example.dokkaflavorbugdemo.model.ProdRequest
import com.example.dokkaflavorbugdemo.model.ProdResult

interface ConnectionManager {
    fun connect(prodRequest: ProdRequest): ProdResult
}

internal class ConnectionManagerImpl() : ConnectionManager{
    override fun connect(prodRequest: ProdRequest): ProdResult {
        Log.d("Tag","Connect to prod")
        return ProdResult("Prod")
    }
}