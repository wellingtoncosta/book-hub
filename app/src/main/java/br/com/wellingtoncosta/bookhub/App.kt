package br.com.wellingtoncosta.bookhub

import android.app.Application
import br.com.wellingtoncosta.bookhub.di.bookHubApp
import org.koin.android.ext.android.startKoin

/**
 * @author Wellington Costa on 09/10/18.
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, bookHubApp)
    }

}