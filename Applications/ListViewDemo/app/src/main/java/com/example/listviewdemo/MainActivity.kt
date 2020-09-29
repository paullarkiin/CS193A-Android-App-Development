package com.example.listviewdemo

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.main_listView)
       /* val redColor = Color.parseColor("#FF0000")
        listView.setBackgroundColor(redColor)*/

        listView.adapter =  MyCustomAdapter(this) // custom adapter for list
    }

    private class MyCustomAdapter(context:Context): BaseAdapter() {
        private val mContext: Context

        init {
            this.mContext = context
        }

        //responsible for how many rows in my list
        override fun getCount(): Int {
            return 5
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }
        override fun getItem(position: Int): Any {
            return "Test String"

        }

        //responsible for rending out each row
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val textView = TextView(mContext)
            textView.text = "HERE is my ROW for my LISTVIEW"
            return textView
        }
    }
}
