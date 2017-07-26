package com.mobile.seekhealth.presentation

import android.view.MenuItem
import com.mobile.seekhealth.R
import com.mobile.seekhealth.presentation.views.MenuSheetDialog
import com.mobile.seekhealth.presentation.views.OptionsMenu

class MainActivity : BaseActivity(), OptionsMenu {
    val TAG = MainActivity::class.java.name!!

    override fun callExecuteOptions(task: Int) {
        when(task){
            1 -> {
                /*val captureDataDevice = CaptureDataOfDevices()
                addFragment(captureDataDevice)*/
            }
        }
    }


    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId){
            R.id.menu_tools ->{
                MenuSheetDialog().show(supportFragmentManager, "Dialog")
            }
            else -> {

            }
        }
        return super.onOptionsItemSelected(item)
    }
}
