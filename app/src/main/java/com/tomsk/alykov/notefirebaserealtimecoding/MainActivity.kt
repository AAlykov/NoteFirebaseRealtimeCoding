package com.tomsk.alykov.notefirebaserealtimecoding

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val personCollectionRef = Firebase.firestore.collection("persons")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("AADebug", "Start")

//AAAAAAAAAAAAAAAAAAAAAAAAA=============================================================
        val db = Firebase.firestore
        val user0 = hashMapOf("first" to "Ada", "last" to "Lovelace", "born" to 1815 )

        // Add a new document with a generated ID
        db.collection("users")
            .add(user0)
            .addOnSuccessListener { documentReference ->
                Log.d("AADebug", "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.d("AADebug", "Error adding document", e)
            }
            .addOnCanceledListener {
                Log.d("AADebug", "CanceledListener")
            }
//VVVVVVVVVVVVVVVVVVVVVVVV=============================================================

        val user: MutableMap<String, Any> = HashMap()
        user["first"] = "Alexey"
        user["last"] = "Alykov"
        user["born"] = 1982

        FirebaseFirestore.getInstance().collection("users")
            .add(user)
            .addOnSuccessListener {
                Log.d("AADebug", "Doc added with ID:" + it.id)
            }
            .addOnFailureListener{
                    e-> Log.d("AADebug", "Error added doc:$e")
            }
            .addOnCanceledListener {
                Log.d("AADebug", "CanceledListener")
            }
        Log.d("AADebug", "End")

    } //override fun onCreate

}