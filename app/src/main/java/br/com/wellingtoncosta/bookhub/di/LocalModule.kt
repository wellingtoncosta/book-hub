package br.com.wellingtoncosta.bookhub.di

import br.com.wellingtoncosta.bookhub.data.datasource.local.UserLocalDataSource
import br.com.wellingtoncosta.bookhub.data.datasource.local.prefs.Preferences
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

/**
 * @author Wellington Costa on 09/10/18.
 */
val localModule = module {
    single { Preferences(androidContext()) }
    single { UserLocalDataSource(get()) }
}