package br.com.wellingtoncosta.bookhub.data.repository

import br.com.wellingtoncosta.bookhub.data.datasource.UserDataSource
import br.com.wellingtoncosta.bookhub.domain.model.Auth
import br.com.wellingtoncosta.bookhub.domain.model.User
import br.com.wellingtoncosta.bookhub.domain.repository.UserRepository
import io.reactivex.Maybe

/**
 * @author Wellington Costa on 09/10/18.
 */
class UserDataRepository(
        private val localDataSource: UserDataSource.Local,
        private val remoteDataSource: UserDataSource.Remote
) : UserRepository {

    override fun create(user: User) = remoteDataSource.create(user)

    override fun authenticate(auth: Auth): Maybe<User> {
        return remoteDataSource.authenticate(auth)
                .doOnSuccess { response ->
                    response.headers().get("Authorization")?.let {
                        localDataSource.saveToken(it)
                    }
                }
                .map { it.body() }
    }

}