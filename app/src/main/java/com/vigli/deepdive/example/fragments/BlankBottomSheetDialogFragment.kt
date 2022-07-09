package com.vigli.deepdive.example.fragments

import android.R
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.vigli.deepdive.example.fragments.databinding.BlankBottomSheetDialogFragmentBinding


class BlankBottomSheetDialogFragment : BottomSheetDialogFragment() {
    companion object {
        fun newInstance() = BlankBottomSheetDialogFragment()
    }

    private lateinit var binding: BlankBottomSheetDialogFragmentBinding

    private lateinit var viewModel: BlankBottomSheetDialogViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = BlankBottomSheetDialogFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this)[BlankBottomSheetDialogViewModel::class.java]
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)

        dialog.setOnShowListener {
            val bottomSheet: FrameLayout = dialog.findViewById(com.google.android.material.R.id.design_bottom_sheet) ?: return@setOnShowListener
            bottomSheet.setBackgroundResource(R.color.transparent)
        }

        return dialog
    }

}