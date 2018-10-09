package br.com.wellingtoncosta.bookhub.domain.repository

import br.com.wellingtoncosta.bookhub.domain.model.Book
import io.reactivex.Flowable
import io.reactivex.Single

/**
 * @author Wellington Costa on 09/10/18.
 */
interface BookRepository {

    fun create(book: Book): Single<Book>

    fun update(book: Book): Single<Book>

    fun fetchAllByUser(userId: Long): Flowable<List<Book>>



}