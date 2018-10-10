package br.com.wellingtoncosta.bookhub.data.datasource.local

import br.com.wellingtoncosta.bookhub.data.datasource.TokenDataSource
import br.com.wellingtoncosta.bookhub.data.datasource.local.prefs.Preferences
import io.reactivex.Maybe
import io.reactivex.Observable

/**
 * @author Wellington Costa on 10/10/18.
 */
class TokenLocalDataSource(
        private val prefs: Preferences
) : TokenDataSource.Local {

    override fun save(token: String): Observable<Unit> = Observable.fromCallable {
        prefs.put("token", token)
        Unit
    }

    override fun get(): Maybe<String> = Maybe.fromCallable {
        prefs.get("token")
    }

    override fun delete(): Observable<Unit> = Observable.fromCallable {
        prefs.remove("token")
    }

}