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
            messages.add(
                Message(
                    "",
                    "Color - Pink",
                    "Size - Small",
                    "Address - Flat No 24, Ramsetu Society, Pune Pincode-410100",
                    "Price - 400",
                    R.drawable.kurti1,
                    "ExpectedDeliveryDate-Free delivery Thursday,30 November details or fastest delivery Tomorrow,29 November."
                )
            )
        messages.add(Message("",
            "color - green",
            "Size - large",
            "address- Address - Flat No 24, Ramsetu Society, Pune Pincode-410100",
            "price-800",
            R.drawable.kurti2,
            "Expected Delivery Date-Free delivery Thursday,13 November details or fastest delivery Tomorrow,29 November."))
        }
    }
