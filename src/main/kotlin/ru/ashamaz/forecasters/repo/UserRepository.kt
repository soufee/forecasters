package ru.ashamaz.forecasters.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.ashamaz.forecasters.model.User

interface UserRepository : JpaRepository<User, Int> {
    override fun findAll(): List<User>
    fun findByName(name: String):List<User>
}