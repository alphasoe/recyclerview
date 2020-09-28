package com.myanmaritc.recyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.myanmaritc.recyclerview1.Adapter.FoodAdapter
import com.myanmaritc.recyclerview1.model.Food
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var foodList = ArrayList<Food>()
        foodList.add(Food("Fine Grain Sugar", 20.00, "1Kg", R.drawable.sugar))
        foodList.add(Food("Peanuts", 20.00, "3Kg", R.drawable.peanuts))
        foodList.add(Food("Dawat Rice", 80.00, "2Kg", R.drawable.rice))

        var foodAdapter = FoodAdapter(foodList)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = foodAdapter
    }
}