package br.com.wellingtoncosta.bookhub.domain.repository

import br.com.wellingtoncosta.bookhub.domain.model.Auth
import br.com.wellingtoncosta.bookhub.domain.model.User
import io.reactivex.Maybe
import io.reactivex.Single

/**
 * @author Wellington Costa on 09/10/18.
 */
interface UserRepository {

    fun create(user: User): Single<User>

    fun authenticate(auth: Auth): Maybe<User>

}