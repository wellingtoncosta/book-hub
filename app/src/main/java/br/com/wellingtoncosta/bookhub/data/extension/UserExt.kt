package br.com.wellingtoncosta.bookhub.data.extension

import br.com.wellingtoncosta.bookhub.data.datasource.local.room.UserEntity
import br.com.wellingtoncosta.bookhub.domain.model.User

/**
 * @author Wellington Costa on 10/10/18.
 */

fun User.toEntity() = UserEntity(name = this.name, username = this.username)

fun UserEntity.toModel() = User(name = this.name, username = this.username)