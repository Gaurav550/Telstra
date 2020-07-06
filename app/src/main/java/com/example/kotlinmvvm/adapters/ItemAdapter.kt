package com.example.kotlinmvvm.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlinmvvm.R
import com.example.kotlinmvvm.models.RowModel

class ItemAdapter(private val rows: MutableList<RowModel>, val context: Context) :
    RecyclerView.Adapter<ItemAdapter.MyHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return rows.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        if (rows[position].description != null) {
            holder.description.text = rows[position].description
        } else {
            holder.description.text = context.getText(R.string.not_available)
        }
        if (rows[position].title != null) {
            holder.title.text = rows[position].title
        } else {
            holder.title.text = context.getText(R.string.not_available)
        }

        rows[position].imageHref?.let { url ->
            holder.image?.let{
                setImage(url, it)}
        }
    }

    inner class MyHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.tv_title)
        val description: TextView = view.findViewById(R.id.tv_description)
        val image: ImageView? by lazy { view.findViewById<ImageView>(R.id.image) }
    }

    private fun setImage(url: String, view: ImageView) {
        Log.e("image url is : ", url)
        Glide.with(view.context)
            //.load(url)
            .load("https://images.unsplash.com/photo-1566487097168-e91a4f38bee2?ixlib=rb-1.2.1&auto=format&fit=crop&w=1000&q=80")
            .into(view)
    }

}