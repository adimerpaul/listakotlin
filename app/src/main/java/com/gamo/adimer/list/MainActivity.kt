package com.gamo.adimer.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv1=findViewById<TextView>(R.id.tv1)
        val list1=findViewById<ListView>(R.id.list1)
        val paises= arrayOf("Argentina","chile","Paraguay","Bolivia")
        val habitantes= arrayOf(40000,17000,20000,500000)
        var adaptador=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,paises)
        list1.adapter=adaptador
        list1.setOnItemClickListener { adapterView, view, i, l ->
            tv1.text="Poblacion de: ${habitantes[i]}"
        }
    }
}