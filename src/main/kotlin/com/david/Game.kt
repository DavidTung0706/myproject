package com.david

import java.util.*

fun main() {
    val secret = Random().nextInt(10) + 1
    val scanner = Scanner(System.`in`)
    var number = 0
    while (number != secret) {
        print("Please enter a number: ")
        number = scanner.nextInt()
        if (number < secret) {
            println("higher")
        } else if (number > secret) {
            println("lower")
        } else {
            println("Great ! the secret number is $number ")
        }
    }
}