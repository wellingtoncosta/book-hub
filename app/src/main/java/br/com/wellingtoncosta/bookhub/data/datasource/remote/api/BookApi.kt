package br.com.wellingtoncosta.bookhub.data.datasource.remote.api

import br.com.wellingtoncosta.bookhub.domain.model.Book
import io.reactivex.Flowable
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

/**
 * @author Wellington Costa on 09/10/18.
 */
interface BookApi {

    fun create(
            @Header("Authorization") token: String,
            @Body book: Book
    ): Single<Book>

    fun update(
            @Header("Authorization") token: String,
            @Body book: Book
    ): Single<Book>

    @GET("api/livros/usuario/{userId}")
    fun fetchAllByUser(
            @Header("Authorization") token: String,
            @Path("userId") userId: Long
    ): Flowable<List<Book>>

}