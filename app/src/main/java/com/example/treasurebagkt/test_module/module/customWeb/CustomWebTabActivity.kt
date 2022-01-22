package com.example.treasurebagkt.test_module.module.customWeb

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.treasurebagkt.R
import com.example.treasurebagkt.test_module.config.UrlConfig
import com.example.treasurebagkt.test_module.utils.CustomWebTabsUtils

/**
 * @ ProjectName:    TreasureBagKt
 * @ Package:        com.example.treasurebagkt.test_module.module
 * @ ClassName:      customWebTabActivity
 * @ CreateAuthor:   yKnight
 * @ CreateDate:     2022/1/7
 * @ description:   google推荐的Custom Web tab(浏览器)
 */
class CustomWebTabActivity : AppCompatActivity() {
    /**
     * 默认的基础tab
     */
    private lateinit var mDefaultBtn: Button

    /**
     * 自定义tab
     */
    private lateinit var mCustomBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_web)
        findViews()
        setListener()
    }

    private fun setListener() {
        mDefaultBtn.setOnClickListener {
            CustomWebTabsUtils.openDefaultCustomWebTab(this, UrlConfig.CHROME_CUSTOM_TABS)
        }
        mCustomBtn.setOnClickListener {
            CustomWebTabsUtils.openCustomBarTab(
                this,
                UrlConfig.CHROME_CUSTOM_TABS,
                Color.parseColor("#FF0000")
            )
        }
    }

    private fun findViews() {
        mDefaultBtn = findViewById(R.id.open_default_web_btn)
        mCustomBtn = findViewById(R.id.open_custom_web_btn)
    }

}