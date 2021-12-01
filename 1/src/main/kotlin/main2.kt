package main.kotlin

import CommonUtils.Factory.readFile

fun main(args: Array<String>)
{

    val result = readFile("1/src/main/resources/input.txt")
        .asSequence()
        .map { e -> e.toInt() }
        .windowed(3)
        .map { it.sum() }
        .windowed(2)
        .count { (e1, e2) -> e1 < e2 }
    println("Result: $result")
}

