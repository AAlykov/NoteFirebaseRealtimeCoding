package com.tomsk.alykov.notefirebaserealtimecoding.data.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.tomsk.alykov.notefirebaserealtimecoding.data.model.Note
import java.util.*

class NoteRepositoryImpl(val database: FirebaseFirestore): NoteRepository {


    override fun getNotes(): List<Note> {
        //мы достанем данные из firebase и вернем их
        //return  arrayListOf( )
        return  arrayListOf(
            Note(id = 1, text = "text1", date = Date()),
            Note(id = 2, text = "text2", date = Date()), )
    }



}