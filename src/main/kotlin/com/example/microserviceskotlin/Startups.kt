package com.example.microserviceskotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Startups

fun main(args: Array<String>) {
	runApplication<Startups>(*args)
}
