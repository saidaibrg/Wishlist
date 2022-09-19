package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter (private val wishlistItems: List<Item>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val nameTextView = itemView.findViewById<TextView>(R.id.name)
        val priceTextView = itemView.findViewById<TextView>(R.id.price)
        val storeTextView = itemView.findViewById<TextView>(R.id.store)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val itemView = inflater.inflate(R.layout.wishlist_item, parent, false)
        // Return a new holder instance
        return ViewHolder(itemView)
    }

    // Involves populating data into the item through holder
    override fun onBindViewHolder(viewHolder: ItemAdapter.ViewHolder, position: Int) {
        // Get the data model based on position
        val wishItem: Item = wishlistItems.get(position)
        // Set item views based on your views and data model
        val textView1 = viewHolder.nameTextView
        textView1.setText(wishItem.name)
        val textView2 = viewHolder.priceTextView
        textView2.setText(wishItem.price.toString())
        val textView = viewHolder.storeTextView
        textView.setText(wishItem.store)
    }

    // Returns the total count of items in the list
    override fun getItemCount(): Int {
        return wishlistItems.size
    }
}