package br.com.wellingtoncosta.bookhub.data.datasource.remote.api.response

import com.google.gson.annotations.SerializedName

/**
 * @author Wellington Costa on 09/10/18.
 */
data class BookResponse(
        @SerializedName("id") val id: Long,
        @SerializedName("titulo") val title: String,
        @SerializedName("ano") val year: String,
        @SerializedName("favorito") val favorite: Boolean,
        @SerializedName("usuarioId") val userId: Boolean
)