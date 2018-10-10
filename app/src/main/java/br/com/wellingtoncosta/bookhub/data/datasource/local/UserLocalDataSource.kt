package br.com.wellingtoncosta.bookhub.data.datasource.local

import br.com.wellingtoncosta.bookhub.data.datasource.UserDataSource
import br.com.wellingtoncosta.bookhub.data.datasource.local.room.UserDao
import br.com.wellingtoncosta.bookhub.data.extension.toEntity
import br.com.wellingtoncosta.bookhub.data.extension.toModel
import br.com.wellingtoncosta.bookhub.domain.model.User
import io.reactivex.Maybe
import io.reactivex.Observable

/**
 * @author Wellington Costa on 09/10/18.
 */
class UserLocalDataSource(
        private val userDao: UserDao
) : UserDataSource.Local {

    override fun save(user: User) = Observable.fromCallable {
        userDao.insert(user.toEntity())
    }

    override fun getById(userId: Long): Maybe<User> = userDao.getById(userId).map { it.toModel() }

    override fun delete(userId: Long): Observable<Unit> {
        return userDao.getById(userId)
                .doOnSuccess { userDao.delete(it) }
                .toObservable()
                .map { Unit }
    }

}