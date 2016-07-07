package com.kobashin.sample.databindingsample

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

import com.kobashin.sample.databindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private var mBinding: ActivityMainBinding? = null

    private val model = SampleModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        mBinding!!.setModel(model)
    }
}
