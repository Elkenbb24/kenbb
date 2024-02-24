package com.ken_alamilla.productos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var listaProductos: MutableList<dtProductos> = mutableListOf()
    private lateinit var recycler: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listaProductos.add(
            dtProductos("producto1","leche","18","15"))
        listaProductos.add(
            dtProductos("producto2","chocomilk","30","25"))
        listaProductos.add(
            dtProductos("producto3","pan","10","5"))
        listaProductos.add(
            dtProductos("producto4","cerveza","50","40"))
        listaProductos.add(
            dtProductos("producto5","flan","8","5"))
        listaProductos.add(
            dtProductos("producto6","huevos","60","50"))
        listaProductos.add(
            dtProductos("producto7","agua","10","8"))
        listaProductos.add(
            dtProductos("producto8","cereal","40","35"))
        listaProductos.add(
            dtProductos("producto9","papel","70","60"))
        listaProductos.add(
            dtProductos("producto10","carne","100","90"))
        listaProductos.add(
            dtProductos("producto11","azucar","20","15"))
        listaProductos.add(
            dtProductos("producto12","plato","50","30"))
        listaProductos.add(
            dtProductos("producto13","vaso","15","10"))
        listaProductos.add(
            dtProductos("producto14","cafe","80","60"))
        listaProductos.add(
            dtProductos("producto15","pollo","90","75"))
        listaProductos.add(
            dtProductos("producto16","mayonesa","30","25"))
        listaProductos.add(
            dtProductos("producto17","manguera","18","15"))
        listaProductos.add(
            dtProductos("producto18","libreta","85","75"))
        listaProductos.add(
            dtProductos("producto19","chile","100","80"))
        listaProductos.add(
            dtProductos("producto20","pasta","10","5"))

        var tabla = findViewById<RecyclerView>(R.id.tablaProductos)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=ProductosAdapter(this,listaProductos)









    }
}