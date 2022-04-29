package com.example.fragmentweeklytwo.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentweeklytwo.R
import com.example.fragmentweeklytwo.databinding.ActivityMainBinding
import com.example.fragmentweeklytwo.fragment.FragmentTwo

class SupportActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.placeHolder, FragmentTwo())
        transaction.commit()
        binding.btnNext.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}