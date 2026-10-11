package com.example.lab03

fun task1() {
    print("Enter score: ")
    val score = readln().toInt()
    if (score >= 50) {
        println("Pass")
    } else {
        println("Fail")
    }
}

fun task2() {
    print("Enter temperature: ")
    val t = readln().toInt()
    if (t < 0) {
        println("Freezing")
    } else if (t <= 14) {
        println("Cold")
    } else if (t <= 24) {
        println("Mild")
    } else {
        println("Warm")
    }
}

fun task3() {
    print("Enter age: ")
    val age = readln().toInt()
    print("Do you have a ticket (yes/no)? ")
    val hasTicket = readln()
    if (age >= 12 && hasTicket == "yes") {
        println("Enter")
    } else if (age < 12) {
        println("Too young")
    } else {
        println("Need a ticket")
    }
}

fun task4() {
    print("Enter age: ")
    val age = readln().toInt()
    if (age < 13 || age > 65) {
        println("Discount")
    } else {
        println("Regular")
    }
}

fun task5() {
    val a = readln().toInt()
    val b = readln().toInt()
    val max = if (a > b) a else b
    println("max = $max")
}

fun task6() {
    print("Enter score: ")
    val score = readln().toInt()
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }
    println("Grade: $grade")
}

fun task7() {
    print("Enter n: ")
    val n = readln().toInt()
    val label = when {
        n < 0 -> "negative"
        n == 0 -> "zero"
        n % 2 == 0 -> "positive even"
        else -> "positive odd"
    }
    println(label)
}

fun challenge() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val min = if (a <= b && a <= c) a else if (b <= a && b <= c) b else c
    val max = if (a >= b && a >= c) a else if (b >= a && b >= c) b else c
    val mid = a + b + c - min - max
    println("$min $mid $max")
}

fun main() {
    println("--- Task 1 ---")
    task1()
    println("--- Task 2 ---")
    task2()
    println("--- Task 3 ---")
    task3()
    println("--- Task 4 ---")
    task4()
    println("--- Task 5 ---")
    task5()
    println("--- Task 6 ---")
    task6()
    println("--- Task 7 ---")
    task7()
    println("--- Challenge ---")
    challenge()
}