package com.example.wishlist

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//Add parameters that are sent by the function call


class ItemAdapter (private val mContacts: List<Item>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Your holder should contain and initialize a member variable
        // for any view that will be set as you render a row
        val nameTextView = itemView.findViewById<TextView>(R.id.name)
        val priceTextView = itemView.findViewById<TextView>(R.id.price)
        val storeTextView = itemView.findViewById<TextView>(R.id.store)

    }
}