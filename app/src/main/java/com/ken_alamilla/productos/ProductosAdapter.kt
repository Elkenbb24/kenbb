package com.ken_alamilla.productos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class ProductosAdapter(var context:Context,
    var Listadeproductos: MutableList<dtProductos>):
    RecyclerView.Adapter<ProductosAdapter.vHolder>()
{
    inner class vHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        lateinit var txtidproducto: TextView
        init {
            txtidproducto=itemView.findViewById(R.id.txtIDPRODUCTO)
        }
        lateinit var txtdescripcion: TextView
        init {
            txtdescripcion=itemView.findViewById(R.id.txtDESCRIPCION)
        }
        lateinit var txtpreciomenudeo: TextView
        init {
            txtpreciomenudeo=itemView.findViewById(R.id.txtPRECIOMENUDEO)
        }
        lateinit var txtpreciomayoreo: TextView
        init {
            txtpreciomayoreo=itemView.findViewById(R.id.txtPRECIOMAYOREO)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductosAdapter.vHolder {
var itemView= LayoutInflater.from(context).inflate(
    R.layout.vista_productos,parent,false)
        return vHolder(itemView)
    }

    override fun getItemCount(): Int {
        return Listadeproductos.size
    }

    override fun onBindViewHolder(holder: ProductosAdapter.vHolder, position: Int) {
        var productos = Listadeproductos[position]
        holder.txtidproducto.text=productos.IDproducto
        holder.txtdescripcion.text=productos.Descripcion
        holder.txtpreciomenudeo.text=productos.Preciome
        holder.txtpreciomayoreo.text=productos.Precioma





    }


}