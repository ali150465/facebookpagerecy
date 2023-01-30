package com.example.callback


import android.annotation.SuppressLint
import android.renderscript.ScriptGroup.Binding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.callback.SettingsAdapter.*
class SettingsAdapter (var items:List<Settingsitems>):
    RecyclerView.Adapter<SettingsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.facebook,parent,false)
        return ViewHolder(view)
    }
    @SuppressLint("ResourceAsColor", "ResourceType")

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      //  val item =list[position]
         val item = items[position]
        holder.discrabtion.setText( item.contentpost)
        holder.timeshare.setText(item.timeshare)
        holder.username.setText(item.username)
        holder.imageView.setImageResource(R.drawable.qwer)

    }



    override fun getItemCount(): Int = items.size
    class ViewHolder(itemview:View): RecyclerView.ViewHolder(itemview){
        var username:TextView=itemview.findViewById(R.id.nameaccont)
        var timeshare:TextView=itemview.findViewById(R.id.timeshare)
        var discrabtion:TextView=itemview.findViewById(R.id.descrabtion)
        var imageView:ImageView=itemview.findViewById(R.id.postshared)

    }
}



