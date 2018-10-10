package br.com.wellingtoncosta.bookhub.data.repository

import br.com.wellingtoncosta.bookhub.data.datasource.BookDataSource
import br.com.wellingtoncosta.bookhub.data.datasource.UserDataSource
import br.com.wellingtoncosta.bookhub.domain.model.Book
import br.com.wellingtoncosta.bookhub.domain.repository.BookRepository
import io.reactivex.Flowable
import io.reactivex.Single

/**
 * @author Wellington Costa on 09/10/18.
 */
class BookDataRepository(
        private val localDataSource: UserDataSource.Local,
        private val remoteDataSource: BookDataSource.Remote
) : BookRepository {

    override fun create(book: Book): Single<Book> {
        return localDataSource.getToken().flatMapSingle {
            remoteDataSource.create(it, book)
        }
    }

    override fun update(book: Book): Single<Book> {
        return localDataSource.getToken().flatMapSingle {
            remoteDataSource.update(it, book)
        }
    }

    override fun fetchAllByUser(userId: Long): Flowable<List<Book>> {
        return localDataSource.getToken().flatMapPublisher {
            remoteDataSource.fetchAllByUser(it, userId)
        }
    }

}