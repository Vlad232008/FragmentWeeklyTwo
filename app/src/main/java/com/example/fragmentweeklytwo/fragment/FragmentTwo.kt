package com.example.fragmentweeklytwo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentweeklytwo.databinding.FragmentTwoBinding
import com.example.fragmentweeklytwo.dialog.MyAlertDialog

class FragmentTwo : Fragment() {

    private lateinit var binding: FragmentTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentTwoBinding.inflate(inflater, container, false)
        reactionButton()
        return binding.root
    }
    private fun reactionButton() = with(binding){
        btnAlertDialog.setOnClickListener {
            val myDialogFragment = MyAlertDialog()
            val manager = activity?.supportFragmentManager
            if (manager != null) {
                myDialogFragment.show(manager, "myDialog")
            }
        }
    }
}