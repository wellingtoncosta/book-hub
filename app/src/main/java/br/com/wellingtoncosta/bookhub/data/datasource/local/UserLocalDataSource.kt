package br.com.wellingtoncosta.bookhub.data.datasource.local

import br.com.wellingtoncosta.bookhub.data.datasource.UserDataSource
import br.com.wellingtoncosta.bookhub.data.datasource.local.prefs.Preferences
import io.reactivex.Maybe
import io.reactivex.Observable

/**
 * @author Wellington Costa on 09/10/18.
 */
class UserLocalDataSource(
        private val prefs: Preferences
) : UserDataSource.Local {

    override fun saveToken(token: String): Observable<Unit> = Observable.fromCallable {
        prefs.put("token", token)
        Unit
    }

    override fun getToken(): Maybe<String>  = Maybe.fromCallable { prefs.get("token") }

}