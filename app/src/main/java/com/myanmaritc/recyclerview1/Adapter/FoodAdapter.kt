package com.myanmaritc.recyclerview1.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myanmaritc.recyclerview1.R
import com.myanmaritc.recyclerview1.model.Food
import kotlinx.android.synthetic.main.food_item.view.*
import java.util.ArrayList

class FoodAdapter(var foodList: ArrayList<Food>) :
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(food: Food) {
            itemView.foodName_txtView.text = food.name
            itemView.value_txtView.text = food.value.toString()
            itemView.weight_btn.text = food.weight
            itemView.imgView.setImageResource(food.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodAdapter.FoodViewHolder {
       var view=LayoutInflater.from(parent.context).inflate(R.layout.food_item,parent,false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int = foodList.size

    override fun onBindViewHolder(holder: FoodAdapter.FoodViewHolder, position: Int) {
        holder.bind(foodList[position])
    }

}