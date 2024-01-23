package com.example.newshayri

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class Class1(var mainActivity: MainActivity, var array: Array<String>) : BaseAdapter() {
    override fun getCount(): Int {
        return array.size
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var view = LayoutInflater.from(mainActivity).inflate(R.layout.cardbutton,p2,false)

        var card : TextView
        card=view.findViewById(R.id.card)

//        card.setBackgroundResource(HGFHG[])
        card.setText(array[p0])
        return view
    }

}
