package com.example.listview2

import android.content.Context
import android.net.wifi.aware.AwareResources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var mctx:Context,var resources:Int,var items:List<Model>):ArrayAdapter<Model>(mctx,resources,items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater=LayoutInflater.from(mctx)
        val view:View=layoutInflater.inflate(resources,null)
        val imageview:ImageView=view.findViewById(R.id.image)
        val title:TextView=view.findViewById(R.id.Tv_Title)
        val descript:TextView=view.findViewById(R.id.Tv_sub)
        var mitems:Model=items[position]
        imageview.setImageDrawable(mctx.resources.getDrawable(mitems.img))
        title.text=mitems.title
        descript.text=mitems.Description
        return view
    }
}