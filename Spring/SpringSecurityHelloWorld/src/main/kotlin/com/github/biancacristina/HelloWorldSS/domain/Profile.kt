package com.github.biancacristina.HelloWorldSS.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Profile(var rolename: String = "") {
    @Id
    @GeneratedValue
    val id: Long? = null
}