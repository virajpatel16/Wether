package com.example.wether.Adepter

import android.content.Context


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.wether.Model.Wethermodel
import com.example.wether.R
import com.example.wether.convert

class WetherAdepter(data: List<Wethermodel?>?) : RecyclerView.Adapter<WetherAdepter.Wetherholder>() {
    lateinit var context: Context
     var obj=data
    class Wetherholder(itemView: View): ViewHolder(itemView) {
var date = itemView.findViewById<TextView>(R.id.date)
        var time = itemView.findViewById<TextView>(R.id.time)
        var celsious = itemView.findViewById<TextView>(R.id.Celsius)
        var temperature2mMin =itemView.findViewById<TextView>(R.id.minCelsiuses)
        var temperature2mMax = itemView.findViewById<TextView>(R.id.maxCelsiuses)
        var latitute = itemView.findViewById<TextView>(R.id.lat)
        var longtutie=itemView.findViewById<TextView>(R.id.lng)
        var current = itemView.findViewById<TextView>(R.id.current)
 var Fahrenheit =itemView.findViewById<TextView>(R.id.Fahrenheit)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Wetherholder {
        context = parent.context
        return Wetherholder(
            LayoutInflater.from(parent.context).inflate(R.layout.wether_item, parent, false))
    }

    override fun getItemCount(): Int {
       return obj?.size!!
    }

    override fun onBindViewHolder(holder: Wetherholder, position: Int) {
       holder.apply {

   date.text=obj?.get(position)?.timezone
           time.text= obj?.get(position)?.hourly?.time.toString()
           celsious.text= obj?.get(position)?.currentWeather?.temperature.toString()
           temperature2mMax.text= obj?.get(position)?.daily?.temperature2mMax.toString()
           temperature2mMin.text= obj?.get(position)?.daily?.temperature2mMin.toString()
           latitute.text= obj?.get(position)?.latitude.toString()
           longtutie.text=obj?.get(position)?.longitude.toString()
           current.text= obj?.get(position)?.currentWeather.toString()

           val fahrenheit = convert.celsiusToFahrenheit(celsious)
           Fahrenheit.text = String.format("%.2f °F", fahrenheit).format(((-32 ) * 5 /9))



       }

           }

    }


