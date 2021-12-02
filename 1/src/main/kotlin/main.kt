package main.kotlin

fun main()
{
    val result = CommonUtils.readFile("1/src/main/resources/input.txt")
        .map { e -> e.toInt() }
        .windowed(2)
        .count { (e1, e2) -> e1 < e2 }
    println("Result: $result")
}

