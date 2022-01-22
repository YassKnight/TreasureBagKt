package com.example.treasurebagkt.test_module.module.actionBar

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.treasurebagkt.R
import com.example.treasurebagkt.test_module.config.UrlConfig
import com.example.treasurebagkt.test_module.utils.CustomWebTabsUtils

/**
 * @ ProjectName:    TreasureBagKt
 * @ Package:        com.example.treasurebagkt.test_module.module.actionBar
 * @ ClassName:      ActionBarActivity
 * @ CreateAuthor:   yKnight
 * @ CreateDate:     2022/1/7
 * @ description:
 */
class ActionBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_bar)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.sample_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_web -> {
                Toast.makeText(this, "onOptionsItemSelected setting", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    /**
     * [openWeb]由menu的资源xml中设置，定义menu菜单的点击事件
     * 该方法优于[onOptionsItemSelected]的回调
     * 但是切记不能使用'ProGuard'(或类似工具)混淆该方法名，否则会破坏功能
     */
    fun openWeb(item: android.view.MenuItem) {
        CustomWebTabsUtils.openDefaultCustomWebTab(
            this,
            UrlConfig.MENU_XML_URL
        )
    }

}