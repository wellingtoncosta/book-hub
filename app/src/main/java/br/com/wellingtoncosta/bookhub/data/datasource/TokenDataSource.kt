package br.com.wellingtoncosta.bookhub.data.datasource

import io.reactivex.Maybe
import io.reactivex.Observable

/**
 * @author Wellington Costa on 10/10/18.
 */
interface TokenDataSource {

    interface Local {

        fun save(token: String): Observable<Unit>

        fun get(): Maybe<String>

        fun delete(): Observable<Unit>

    }

}