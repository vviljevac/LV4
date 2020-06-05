package com.example.mainactivity

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import androidx.lifecycle.ViewModelProvider
import com.example.mainactivity.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import androidx.lifecycle.MutableLiveData


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val mViewModel = ViewModelProvider(this).get(MainViewModel::class.java)


        binding.resetButton.setOnClickListener{
            mViewModel.colour = Color.DKGRAY
            mViewModel.count = 0
            mViewModel.setColor(mViewModel.colour)
            mViewModel.setCounter(mViewModel.count)
            binding.counterTextView.setBackgroundColor(mViewModel.colour)
            binding.counterTextView.text = mViewModel.count.toString()
        }
        binding.redButton.setOnClickListener {
            mViewModel.colour = Color.RED
            mViewModel.count++
            mViewModel.setColor(mViewModel.colour)
            mViewModel.setCounter(mViewModel.count)
            binding.counterTextView.setBackgroundColor(mViewModel.colour)
            binding.counterTextView.text = mViewModel.count.toString()
        }

        binding.blackButton.setOnClickListener {
            mViewModel.colour = Color.BLACK
            mViewModel.count++
            mViewModel.setColor(mViewModel.colour)
            mViewModel.setCounter(mViewModel.count)
            binding.counterTextView.setBackgroundColor(mViewModel.colour)
            binding.counterTextView.text = mViewModel.count.toString()
        }
        binding.blueButton.setOnClickListener {
            mViewModel.colour = Color.BLUE
            mViewModel.count++
            mViewModel.setColor(mViewModel.colour)
            mViewModel.setCounter(mViewModel.count)
            binding.counterTextView.setBackgroundColor(mViewModel.colour)
            binding.counterTextView.text = mViewModel.count.toString()
        }
        binding.greenButton.setOnClickListener {
            mViewModel.colour = Color.GREEN
            mViewModel.count++
            mViewModel.setColor(mViewModel.colour)
            mViewModel.setCounter(mViewModel.count)
            binding.counterTextView.setBackgroundColor(mViewModel.colour)
            binding.counterTextView.text = mViewModel.count.toString()
        }
    }
}
