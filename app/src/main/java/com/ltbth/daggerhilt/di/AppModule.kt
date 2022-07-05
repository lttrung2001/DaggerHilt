package com.ltbth.daggerhilt.di

import com.ltbth.daggerhilt.repository.CryptocurrencyRepository
import com.ltbth.daggerhilt.repository.impl.CryptocurrencyRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideCryptocurrencyRepository(): CryptocurrencyRepository = CryptocurrencyRepositoryImpl()
}