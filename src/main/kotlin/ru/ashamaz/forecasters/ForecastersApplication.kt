package ru.ashamaz.forecasters

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ForecastersApplication

fun main(args: Array<String>) {
	runApplication<ForecastersApplication>(*args)
}
