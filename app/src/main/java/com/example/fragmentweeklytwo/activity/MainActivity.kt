package com.example.fragmentweeklytwo.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentweeklytwo.R
import com.example.fragmentweeklytwo.databinding.ActivityMainBinding
import com.example.fragmentweeklytwo.fragment.FragmentOne

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.placeHolder, FragmentOne())
        transaction.commit()
        binding.btnNext.setOnClickListener {
            startActivity(Intent(this,SupportActivity::class.java))
        }
    }
}