package com.tomsk.alykov.notefirebaserealtimecoding.data.model

import com.google.firebase.firestore.ServerTimestamp
import java.util.Date

data class Note (
    val id: Int,
    val text: String,
    @ServerTimestamp //метка времени из либы firestore
    val date: Date
    )