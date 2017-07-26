package com.mobile.seekhealth.presentation

import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import com.mobile.seekhealth.R

abstract class BaseActivity: AppCompatActivity() {
    protected var etEmail: EditText? = null
    protected var etPassword: EditText? = null
    protected var etName: EditText? = null
    protected var tvWelcome: TextView? = null
    protected var rbAccess: RadioButton? = null
    protected var rbNew: RadioButton? = null
    protected var btSend: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomSheet: View = findViewById(R.id.bottomSheetLayout)
        BottomSheetBehavior.from(bottomSheet)
        etEmail = findViewById(R.id.et_email) as EditText
        etPassword = findViewById(R.id.et_password) as EditText
        etName = findViewById(R.id.et_name) as EditText
        btSend = findViewById(R.id.bt_send) as Button
        tvWelcome = findViewById(R.id.tv_welcome) as TextView
        rbAccess = findViewById(R.id.rb_access) as RadioButton
        rbNew = findViewById(R.id.rb_new) as RadioButton

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}