package com.tomsk.alykov.notefirebaserealtimecoding.note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tomsk.alykov.notefirebaserealtimecoding.R
import com.tomsk.alykov.notefirebaserealtimecoding.databinding.FragmentNoteListingBinding

class NoteDetailFragment : Fragment() {

    lateinit var binding:FragmentNoteListingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNoteListingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}