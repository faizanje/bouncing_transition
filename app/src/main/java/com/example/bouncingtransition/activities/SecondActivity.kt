package com.example.bouncingtransition.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bouncingtransition.R
import com.example.bouncingtransition.databinding.ActivityFirstBinding
import com.example.bouncingtransition.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            finish()
            overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right)
        }
    }
}