package br.com.wellingtoncosta.bookhub.data.datasource.remote.api.response

import com.google.gson.annotations.SerializedName

/**
 * @author Wellington Costa on 09/10/18.
 */
data class UserResponse(
        @SerializedName("nome") val name: String,
        @SerializedName("login") val username: String,
        @SerializedName("senha") val password: String
)