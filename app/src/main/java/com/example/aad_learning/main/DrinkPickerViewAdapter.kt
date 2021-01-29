package com.example.aad_learning.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aad_learning.R


class DrinkPickerViewAdapter : RecyclerView.Adapter<DrinkPickerViewAdapter.DesiredViewHolder>() {

    private val viewData = LinkedHashMap<PageType, List<String>>()
    private var selectedCategories = "";
    private var selectedGlasses = "";

    fun submitData(key: PageType, list: List<String>) {
        viewData[key] = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DesiredViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.page_item, parent, false)
        return  DesiredViewHolder(view)
    }

    override fun onBindViewHolder(holder: DesiredViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


    enum class PageType {
        CATEGORIES, GLASSES
    }

    inner class DesiredViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val container = itemView.container
        val result = itemView.
    }





}
