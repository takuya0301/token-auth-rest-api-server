package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class DemoApplication {
    @GetMapping("/hello")
    fun hello() = "Hello, world!\n"

    @PostMapping("/hello")
    fun helloWithName(@RequestBody name: String) = "Hello, $name!\n"
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
