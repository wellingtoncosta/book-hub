package br.com.wellingtoncosta.bookhub.data.datasource

import br.com.wellingtoncosta.bookhub.domain.model.Auth
import br.com.wellingtoncosta.bookhub.domain.model.User
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.Response

/**
 * @author Wellington Costa on 09/10/18.
 */
interface UserDataSource {

    interface Local {

        fun save(user: User): Observable<Long>

        fun getById(userId: Long): Maybe<User>

        fun delete(userId: Long): Observable<Unit>
    }

    interface Remote {

        fun create(user: User): Single<User>

        fun authenticate(auth: Auth): Maybe<Response<User>>

    }

}