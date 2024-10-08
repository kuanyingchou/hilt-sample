package com.example.testhilt3

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class MyModule {
    @Provides
    fun provideString(): String = "hello"
}