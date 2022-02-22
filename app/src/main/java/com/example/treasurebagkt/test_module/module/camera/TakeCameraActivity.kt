package com.example.treasurebagkt.test_module.module.camera

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.treasurebagkt.R

/**
 * @ ProjectName:    TreasureBagKt
 * @ Package:        com.example.treasurebagkt.test_module.module.camera
 * @ ClassName:      TakeCameraActivity
 * @ CreateAuthor:   yKnight
 * @ CreateDate:     2022/1/25
 * @ description:
 */
class TakeCameraActivity:AppCompatActivity() {
    /**
     * 调用系统相机拍摄照片
     *
     * 从6.0开始，如果使用'action_image_capture'来调用系统相机，
     * 在未声明camera权限可以在不用动态申请camera权限的情况下正常使用
     *
     * 但是如果项目中声明了camera权限或者引用的jar使用了camera权限后，
     * 必须要动态申请权限camera权限才可以正常使用
     */
    private lateinit var mActionImageCaptureBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_take_camera)
        findViews()
        setListener()
    }

    private fun setListener() {
        mActionImageCaptureBtn.setOnClickListener{
            ActionImageCaptureActivity.start(this)
        }
    }

    private fun findViews() {
        mActionImageCaptureBtn=findViewById(R.id.action_image_capture)
    }

}