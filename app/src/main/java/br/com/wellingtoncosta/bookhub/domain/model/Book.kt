package br.com.wellingtoncosta.bookhub.domain.model

/**
 * @author Wellington Costa on 09/10/18.
 */
data class Book(
        val id: Long,
        val title: String,
        val author: String,
        val year: String,
        val favorite: Boolean,
        val userId: Long
)