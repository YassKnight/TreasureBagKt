package com.example.treasurebagkt.test_module.bean

/**
 * @ ProjectName:    TreasureBagKt
 * @ Package:        com.example.treasurebagkt.test_module.bean
 * @ ClassName:      MenuBean
 * @ CreateAuthor:   yKnight
 * @ CreateDate:     2022/1/6
 * @ description:   主页菜单列表实体，菜单名[titleName]，跳转的类[cls]
 */
data class MenuBean(private val titleName: String, private val cls: Class<*>) {

    fun getTitleName(): String = titleName

    fun getCls(): Class<*> = cls
}
