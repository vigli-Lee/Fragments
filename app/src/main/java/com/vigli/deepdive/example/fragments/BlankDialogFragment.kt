package com.vigli.deepdive.example.fragments

import android.app.Dialog
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.DialogFragment.STYLE_NORMAL
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BlankDialogFragment : AppCompatDialogFragment() {

    companion object {
        fun newInstance() = BlankDialogFragment()
    }

    private lateinit var viewModel: BlankDialogViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NO_TITLE, R.style.Theme_Dialog_FitContent)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.blank_dialog_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[BlankDialogViewModel::class.java]
    }

//    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
//        val dialog = AlertDialog.Builder(requireContext())
//            .setMessage("message")
//            .setTitle("title")
//            .setPositiveButton("positive") { dialog, id ->
//
//            }
//            .create()
//
//        return dialog
//    }

}