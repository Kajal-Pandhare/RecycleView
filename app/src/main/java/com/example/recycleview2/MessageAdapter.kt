package com.example.recycleview2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class MessageAdapter(private val messages:ArrayList<Message>
): RecyclerView.Adapter<MessageAdapter.MessageViewHolder>(){
    class MessageViewHolder(view : View ) : RecyclerView.ViewHolder(view){
        val imgSender : ImageView
        val txtColor : TextView
        val txtSize : TextView
        val txtAddresss : TextView
        val txtPrise : TextView

        init {
            imgSender = view.findViewById(R.id.imgSender)
            txtColor = view.findViewById(R.id.txtColor)
            txtSize = view.findViewById(R.id.txtSize)
            txtAddresss = view.findViewById(R.id.txtAddress)
            txtPrise = view.findViewById(R.id.txtPrise)
        }
    }

    override fun getItemCount() = messages.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.message_view,null)

        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {

        holder.imgSender.setImageResource(messages[position].senderImageId)
        holder.txtColor.text = messages[position].color
        holder.txtSize.text = messages[position].size
        holder.txtAddresss.text = messages[position].address
        holder.txtPrise.text = messages[position].prise
    }
}