package com.example.bouncingtransition.activities

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bouncingtransition.R
import com.example.bouncingtransition.databinding.ActivityFirstBinding
import com.example.bouncingtransition.databinding.FragmentABinding

class FirstActivity : AppCompatActivity() {
    lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            startActivity(Intent(this,SecondActivity::class.java))
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
        binding.btnFragment.setOnClickListener{
            finish()

        }


    }
}