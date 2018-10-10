package br.com.wellingtoncosta.bookhub.data.datasource.remote

import br.com.wellingtoncosta.bookhub.data.datasource.UserDataSource
import br.com.wellingtoncosta.bookhub.data.datasource.remote.api.UserApi
import br.com.wellingtoncosta.bookhub.domain.model.Auth
import br.com.wellingtoncosta.bookhub.domain.model.User

/**
 * @author Wellington Costa on 09/10/18.
 */
class UserRemoteDataSource(
        private val api: UserApi
) : UserDataSource.Remote {

    override fun create(user: User) = api.create(user)

    override fun authenticate(auth: Auth) = api.authenticate(auth)

}