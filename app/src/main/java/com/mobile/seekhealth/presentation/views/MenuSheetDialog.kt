package com.mobile.seekhealth.presentation.views

import android.content.Context
import android.os.Bundle
import android.support.design.widget.BottomSheetDialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mobile.seekhealth.R


class MenuSheetDialog: BottomSheetDialogFragment() {
    var optionsMenu: OptionsMenu? = null

    override fun onCreateView(inflater: LayoutInflater?,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.sheet_dialog_menu, container, false)
        view!!.findViewById(R.id.ib_capture).setOnClickListener(onClickListener)
        return  view
    }

    internal val onClickListener = View.OnClickListener {
        view -> when(view.id){
        R.id.ib_capture -> {
            optionsMenu!!.callExecuteOptions(1)
            dismiss()
        }
    }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        optionsMenu = context as OptionsMenu
    }
}