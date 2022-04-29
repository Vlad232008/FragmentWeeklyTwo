package com.example.fragmentweeklytwo.dialog

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment

class MyAlertDialog: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        Log.d("MyLog","onCreate MyAlertDialog onCreateDialog")
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle("Заголовок")
                .setMessage("Текст сообщения")
                .setPositiveButton("Кнопка") {
                        dialog, id ->  dialog.cancel()
                }
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}