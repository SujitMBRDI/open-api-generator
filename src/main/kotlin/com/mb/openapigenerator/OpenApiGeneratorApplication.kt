package com.mb.openapigenerator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OpenApiGeneratorApplication

fun main(args: Array<String>) {
    runApplication<OpenApiGeneratorApplication>(*args)
}
