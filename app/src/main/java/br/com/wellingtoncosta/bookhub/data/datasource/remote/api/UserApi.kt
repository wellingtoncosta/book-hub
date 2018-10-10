package br.com.wellingtoncosta.bookhub.data.datasource.remote.api

import br.com.wellingtoncosta.bookhub.domain.model.Auth
import br.com.wellingtoncosta.bookhub.domain.model.User
import io.reactivex.Maybe
import io.reactivex.Single
import retrofit2.Response

/**
 * @author Wellington Costa on 09/10/18.
 */
interface UserApi {

    fun create(user: User): Single<User>

    fun authenticate(auth: Auth): Maybe<Response<User>>

}