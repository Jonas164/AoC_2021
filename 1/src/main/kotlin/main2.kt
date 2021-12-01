package main.kotlin

import CommonUtils.Factory.readFile

fun main(args: Array<String>)
{
    val input = readFile("1/src/main/resources/input2.txt").map { e -> e.toInt() }
    var prev = SlidingWindow(0, 0, 0)
    var increased = 0;
    for (i in 0..input.size - 3)
    {
        val win = SlidingWindow(input[i], input[i + 1], input[i + 2])
        if (win.sum() > prev.sum())
        {
            increased++
        }
        prev = win;
    }

    println("Result: ${increased - 1}")
}


data class SlidingWindow(val first: Int, val second: Int, val third: Int)
{
    fun sum(): Int
    {
        return first + second + third
    }
}

