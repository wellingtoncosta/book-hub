package br.com.wellingtoncosta.bookhub.di

import br.com.wellingtoncosta.bookhub.data.repository.BookDataRepository
import br.com.wellingtoncosta.bookhub.data.repository.UserDataRepository
import org.koin.dsl.module.module

/**
 * @author Wellington Costa on 09/10/18.
 */

val repositoryModule = module {
    single { UserDataRepository(get(), get(), get()) }
    single { BookDataRepository(get(), get()) }
}