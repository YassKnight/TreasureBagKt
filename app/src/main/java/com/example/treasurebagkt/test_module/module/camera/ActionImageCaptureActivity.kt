package com.example.treasurebagkt.test_module.module.camera

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.treasurebagkt.R

/**
 * @ ProjectName:    TreasureBagKt
 * @ Package:        com.example.treasurebagkt.test_module.module.camera
 * @ ClassName:      ActionImageCaptureActivity
 * @ CreateAuthor:   yKnight
 * @ CreateDate:     2022/1/26
 * @ description:
 *
 *      调用系统相机拍摄照片
 *
 * 从6.0开始，如果使用'action_image_capture'来调用系统相机，
 * 在未声明camera权限可以在不用动态申请camera权限的情况下正常使用
 *
 * 但是如果项目中声明了camera权限或者引用的jar使用了camera权限后，
 * 必须要动态申请权限camera权限才可以正常使用
 */
class ActionImageCaptureActivity : AppCompatActivity() {
    private lateinit var mTakePhotoBtn: Button

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, ActionImageCaptureActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aciont_image_capture)
        findViews()
        setListenter()
    }

    private fun findViews() {
        mTakePhotoBtn = findViewById(R.id.action_image_capture)
    }

    private fun setListenter() {
        mTakePhotoBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            //判断目标Activity是否存在
            if (intent.resolveActivity(packageManager) != null) {
            }
        })
    }


}