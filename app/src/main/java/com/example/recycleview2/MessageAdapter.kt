package com.example.recycleview2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class MessageAdapter(private val messages:ArrayList<Message>
): RecyclerView.Adapter<MessageAdapter.MessageViewHolder>(){
    inner class MessageViewHolder(view : View ) : RecyclerView.ViewHolder(view){
        val imgSender : ImageView
        val sender : TextView
        val txtColor : TextView
        val txtSize : TextView
        val txtAddresss : TextView
        val txtPrice : TextView
        val txtExpectedDeliveryDate : TextView

        init {
            imgSender = view.findViewById(R.id.imgSender)
            sender = view.findViewById(R.id.txtSender)
            txtColor = view.findViewById(R.id.txtColor)
            txtSize = view.findViewById(R.id.txtSize)
            txtAddresss = view.findViewById(R.id.txtAddress)
            txtPrice = view.findViewById(R.id.txtPrice)
            txtExpectedDeliveryDate = view.findViewById(R.id.txtDelivery)

            itemView.setOnClickListener {
                Toast.makeText(it.context,"Message From: ${messages[adapterPosition].sender}",Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun getItemCount() = messages.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.message_view,null)

//        view.setOnClickListener {
//            Toast.makeText(it.context,"Message Clicked",Toast.LENGTH_LONG).show()
//        }

        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {

        holder.imgSender.setImageResource(messages[position].senderImageId)
        //holder.imgKurti.setImageResource(messages[position].senderImageId)
        holder.sender.text = messages[position].sender
        holder.txtColor.text = messages[position].color
        holder.txtSize.text = messages[position].size
        holder.txtAddresss.text = messages[position].address
        holder.txtPrice.text = messages[position].prise
        holder.txtExpectedDeliveryDate.text = messages[position].expectedDeliveryDate

//        holder.itemView.setOnClickListener {
//            Toast.makeText(it.context,"Message from:${messages[position].sender} clicked",Toast.LENGTH_LONG).show()
//        }
    }
}