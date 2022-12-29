package com.tomsk.alykov.notefirebaserealtimecoding.di

import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class) //установка одноэлементного компонента
@Module
object FirebaseModule {

    @Provides
    @Singleton
    fun provideFireStoreInstance(): FirebaseFirestore {
        return FirebaseFirestore.getInstance()
    }
}