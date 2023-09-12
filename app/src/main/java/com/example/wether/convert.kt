package com.example.wether

import android.widget.TextView
import java.text.DecimalFormat


class convert {

    companion object {
        fun celsiusToFahrenheit(celsius: TextView): TextView {

           var df =DecimalFormat("#.##")
            celsius.text=df.format((-32 ) * 5 /9)
            return celsius
        }
    }
}