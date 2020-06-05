package com.example.mainactivity

import android.graphics.Color
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
     var count = 0
     var colour = Color.DKGRAY

    fun setCounter(count:Int){
        this.count = count
    }
    fun getCounter(): Int{
        return this.count
    }
    fun setColor(color: Int){
        this.colour = color
    }
    fun getColor(): Int{
        return colour
    }

}