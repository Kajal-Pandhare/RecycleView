package com.example.recycleview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerMessage: RecyclerView
    private lateinit var messageAdapter: MessageAdapter
    private val messages = ArrayList<com.example.recycleview2.Message>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerMessage = findViewById(R.id.recycleMessage)

        initMessages()

        messageAdapter = MessageAdapter(messages)
        recyclerMessage.adapter = messageAdapter

        recyclerMessage.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }
    private fun initMessages() {
        for (i in 0..10) {
            messages.add(
                Message(
                    "Color - Red",
                    "Size - Small",
                    "Address - S No 24 Plot No 90 Rd No 5 Ganeshnagar Bopkhel Pune pincode-411031",
                    "Prise - 400",
                    R.drawable.kurti1,
                )
            )
        }
    }
}