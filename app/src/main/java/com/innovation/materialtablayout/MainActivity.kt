package com.innovation.materialtablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import com.innovation.materialtablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy(LazyThreadSafetyMode.NONE){
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val mTitles_2 = arrayOf("首页", "消息")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.tl2.setTabData(mTitles_2)
        binding.tl2.setOnTabSelectListener(object : OnTabSelectListener{
            override fun onTabSelect(position: Int) {

            }

            override fun onTabReselect(position: Int) {

            }

        })

    }
}