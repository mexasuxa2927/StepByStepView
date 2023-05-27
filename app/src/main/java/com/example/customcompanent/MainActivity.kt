package com.example.customcompanent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customcompanent.databinding.ActivityMainBinding
import com.example.stepbystep.StepView

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myStep.setStepText1("asssssss\nssssssss")
        binding.myStep.setStepViewIcon2(StepView.SELECT)
        binding.myStep.setStepViewIcon1(StepView.DONE)


    }
}