package com.tomsk.alykov.notefirebaserealtimecoding.data.repository

import com.tomsk.alykov.notefirebaserealtimecoding.data.model.Note

interface NoteRepository {
    fun getNotes(): List<Note>
}