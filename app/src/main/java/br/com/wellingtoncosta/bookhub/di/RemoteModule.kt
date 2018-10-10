package br.com.wellingtoncosta.bookhub.di

import br.com.wellingtoncosta.bookhub.BuildConfig
import br.com.wellingtoncosta.bookhub.data.datasource.remote.BookRemoteDataSource
import br.com.wellingtoncosta.bookhub.data.datasource.remote.UserRemoteDataSource
import br.com.wellingtoncosta.bookhub.data.datasource.remote.api.BookApi
import br.com.wellingtoncosta.bookhub.data.datasource.remote.api.UserApi
import okhttp3.OkHttpClient
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @author Wellington Costa on 09/10/18.
 */

private const val CONNECTION_TIMEOUT = 30000

val remoteModule = module {
    single { createOkHttpClient() }
    single { createRetrofit(get()) }
    single { createApi<BookApi>(get()) }
    single { createApi<UserApi>(get()) }
    single { BookRemoteDataSource(get()) }
    single { UserRemoteDataSource(get()) }
}

private fun createOkHttpClient() = OkHttpClient.Builder()
        .connectTimeout(CONNECTION_TIMEOUT.toLong(), TimeUnit.MILLISECONDS)
        .build()

private fun createRetrofit(okHttpClient: OkHttpClient) = Retrofit.Builder()
        .baseUrl(BuildConfig.API_URL)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

inline fun <reified T> createApi(retrofit: Retrofit): T = retrofit.create(T::class.java)