package com.example.treasurebagkt.test_module.utils

import android.content.Context
import android.net.Uri
import androidx.annotation.ColorInt
import androidx.browser.customtabs.CustomTabColorSchemeParams
import androidx.browser.customtabs.CustomTabsIntent

/**
 * @ ProjectName:    TreasureBagKt
 * @ Package:        com.example.treasurebagkt.test_module.utils
 * @ ClassName:      CustomWebTabsUtils
 * @ CreateAuthor:   yKnight
 * @ CreateDate:     2022/1/7
 * @ description:
 */
object CustomWebTabsUtils {

    @JvmStatic
    fun openDefaultCustomWebTab(context: Context, url: String) {
        val builder: CustomTabsIntent.Builder = CustomTabsIntent.Builder()
        val customTabsIntent: CustomTabsIntent = builder.build()
        customTabsIntent.launchUrl(context, Uri.parse(url))
    }

    @JvmStatic
    fun openCustomBarTab(context: Context, url: String, @ColorInt colorInt: Int) {
        val builder: CustomTabsIntent.Builder = CustomTabsIntent.Builder()

        val colorParams: CustomTabColorSchemeParams = CustomTabColorSchemeParams.Builder()
            .setToolbarColor(colorInt)
            .build()
        builder.setDefaultColorSchemeParams(colorParams)

        val customTabsIntent: CustomTabsIntent = builder.build()
        customTabsIntent.launchUrl(context, Uri.parse(url))
    }
}