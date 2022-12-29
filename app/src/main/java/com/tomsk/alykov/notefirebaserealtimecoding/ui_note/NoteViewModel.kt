package com.tomsk.alykov.notefirebaserealtimecoding.ui_note

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tomsk.alykov.notefirebaserealtimecoding.data.model.Note
import com.tomsk.alykov.notefirebaserealtimecoding.data.repository.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

//тут нам нужна зависмость от репозитория

@HiltViewModel
class NoteViewModel @Inject constructor(val repository: NoteRepository): ViewModel() {

    private val _notes = MutableLiveData<List<Note>>()

    val note: LiveData<List<Note>>
    get() = _notes

    fun getNotes() {
        //return repository.getNotes()
        _notes.value = repository.getNotes()
    }

}