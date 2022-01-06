package com.example.treasurebagkt.test_module.module.main

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.treasurebagkt.R
import com.example.treasurebagkt.test_module.bean.MenuBean

/**
 * @ ProjectName:    TreasureBagKt
 * @ Package:        com.example.treasurebagkt.test_module.Main
 * @ ClassName:      MenuAdapter
 * @ CreateAuthor:   yKnight
 * @ CreateDate:     2022/1/5
 * @ description:   主页菜单适配器，上下文[mContext],菜单列表数据[mData]
 */
class MenuAdapter(
    private val mContext: Context,
    private val mData: List<MenuBean>
) :
    RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {


    override fun getItemCount(): Int = mData.size

    inner class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView = itemView.findViewById(R.id.item_menu_name_tv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder =
        MenuViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_menu, parent, false))

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.textView.text = mData[position].getTitleName()
        holder.itemView.setOnClickListener {
            mContext.startActivity(Intent(mContext, mData[position].getCls()))
        }
    }
}