package com.example.listview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mylistview=findViewById<ListView>(R.id.mylistview)
        var list= mutableListOf<Model>()
        list.add(Model("Cat Meow","A cat is a mammal", R.drawable.meow))
        list.add(Model("Seal Sea","A seal is a mammal", R.drawable.heh))
        list.add(Model("Giraffe Veggie","A giraffe is a mammal", R.drawable.hello))
        list.add(Model("Cub leo","A leopard is a mammal", R.drawable.purr))
        list.add(Model("Penguin baby","A penguin is a mammal", R.drawable.yello))
        list.add(Model("Duck Quack","A Duck is a bird", R.drawable.you))

        mylistview.adapter=MyAdapter(this,R.layout.row,list)
    }
}