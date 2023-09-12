package com.example.wether

import android.R
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wether.Adepter.WetherAdepter
import com.example.wether.Model.Wethermodel
import com.example.wether.api.Apiclint
import com.example.wether.api.WeatherApi
import com.example.wether.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import retrofit2.Call
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

callapi()
    }

    private fun callapi() {
        var apiinterface=Apiclint.getapi().create(WeatherApi::class.java)
        apiinterface.getWeatherData(52.52,13.41,"temperature_2m,rain,snowfall,visibility","34","22","weathercode","temperature_2m_max,temperature_2m_min,sunrise,sunset",true,"auto","2023-09-12","2023-09-12")
            .enqueue(object : retrofit2.Callback<List<Wethermodel>>{
                override fun onResponse(
                    call: Call<List<Wethermodel>>,
                    response: Response<List<Wethermodel>>
                ) {
                   var data = response.body()
                    binding.recycledata.layoutManager=LinearLayoutManager(this@MainActivity)
                    binding.recycledata.adapter=WetherAdepter(data)


                }

                override fun onFailure(call: Call<List<Wethermodel>>, t: Throwable) {

                }


            })



}
}