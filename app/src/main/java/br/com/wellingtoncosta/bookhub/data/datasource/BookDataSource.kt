package br.com.wellingtoncosta.bookhub.data.datasource

import br.com.wellingtoncosta.bookhub.domain.model.Book
import io.reactivex.Flowable
import io.reactivex.Single

/**
 * @author Wellington Costa on 09/10/18.
 */
interface BookDataSource {

    interface Remote {

        fun create(token: String, book: Book): Single<Book>

        fun update(token: String, book: Book): Single<Book>

        fun fetchAllByUser(token: String, userId: Long): Flowable<List<Book>>

    }

}