package com.wm.bitco.di

import com.wm.bitco.data.repository.BitcoRepositoryImpl
import com.wm.bitco.domain.repository.BitcoRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindBitcoRepository(
        bitcoRepositoryimpl: BitcoRepositoryImpl
    ):BitcoRepository
}
