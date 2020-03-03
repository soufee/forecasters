package ru.ashamaz.forecasters.rest

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.ashamaz.forecasters.dto.UserDto
import ru.ashamaz.forecasters.model.User
import ru.ashamaz.forecasters.repo.UserRepository

@RestController
class UsersController(private val repository: UserRepository) {
    private val log: Logger = LoggerFactory.getLogger("ru.ashamaz.forecasters.rest.UsersController")

    init {
        val user = User()
        user.name = "Shama"
        repository.save(user)
    }


    @GetMapping("/usersDto")
    fun allUsersDto(): List<UserDto> {
        log.debug("Зашли в метод получения списка всех пользователей DTO")
        return listOf(
                UserDto("01", "Ivan"),
                UserDto("02", "Vasya")
        )
    }
    @GetMapping("/users")
    fun allUsers(): List<User> {
        log.debug("Зашли в метод получения списка всех пользователей")
        return repository.findAll()
    }

}