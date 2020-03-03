package ru.ashamaz.forecasters.model

import javax.persistence.*

@Entity
@Table(name = "users")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,
        var name: String) {
    constructor() : this(0, "") {

    }

}