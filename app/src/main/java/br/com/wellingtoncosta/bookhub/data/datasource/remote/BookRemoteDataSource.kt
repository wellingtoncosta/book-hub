package br.com.wellingtoncosta.bookhub.data.datasource.remote

import br.com.wellingtoncosta.bookhub.data.datasource.BookDataSource
import br.com.wellingtoncosta.bookhub.data.datasource.remote.api.BookApi
import br.com.wellingtoncosta.bookhub.domain.model.Book

/**
 * @author Wellington Costa on 09/10/18.
 */
class BookRemoteDataSource(
        private val api: BookApi
) : BookDataSource.Remote {

    override fun create(token: String, book: Book) = api.create(token, book)

    override fun update(token: String, book: Book) = api.update(token, book)

    override fun fetchAllByUser(token: String, userId: Long) = api.fetchAllByUser(token, userId)

}