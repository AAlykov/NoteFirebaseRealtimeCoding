package com.tomsk.alykov.notefirebaserealtimecoding.ui_note

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import com.tomsk.alykov.notefirebaserealtimecoding.databinding.FragmentNoteListingBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NoteListingFragment : Fragment() {

    lateinit var binding: FragmentNoteListingBinding
    val viewModel: NoteViewModel by viewModels() //хитрый маневр через либу "androidx.lifecycle:lifecycle-livedata-ktx:2.5.1"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("AADebug", "onCreateView: NoteListingFragment")
        binding = FragmentNoteListingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("AADebug", "onViewCreated: NoteListingFragment")
        binding.textViewNoteListing.text = "ddddddddddddddddddddd"
        viewModel.getNotes()

        viewModel.note.observe(viewLifecycleOwner) {
            it.forEach {
                Log.d("AADebug", "onViewCreated: ${it.toString()}")
            }

        }
//        this.viewModel.note.observe(viewLifecycleOwner) {
//
//        }
    }

}