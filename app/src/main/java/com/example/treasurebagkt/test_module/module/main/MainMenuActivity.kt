package com.example.treasurebagkt.test_module.module.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.treasurebagkt.R
import com.example.treasurebagkt.test_module.bean.MenuBean
import com.example.treasurebagkt.test_module.module.testMani.TestManiFestActivity

/**
 * @ ProjectName:    TreasureBagKt
 * @ Package:        com.example.treasurebagkt.test_module
 * @ ClassName:      MainMenuActivity
 * @ CreateAuthor:   yKnight
 * @ CreateDate:     2022/1/5
 * @ description:   主菜单页面
 */
class MainMenuActivity : AppCompatActivity() {

    private lateinit var mMenuRv: RecyclerView
    private lateinit var menuAdapter: MenuAdapter

    private var mMenuList: List<MenuBean> =
        arrayListOf(MenuBean("ManiFest配置测试", TestManiFestActivity::class.java))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        mMenuRv = findViewById(R.id.menu_rv)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val layoutMg: RecyclerView.LayoutManager = LinearLayoutManager(this)
        menuAdapter = MenuAdapter(this, mMenuList)
        mMenuRv.run {
            layoutManager = layoutMg
            setHasFixedSize(true)
            adapter = menuAdapter
        }
    }
}