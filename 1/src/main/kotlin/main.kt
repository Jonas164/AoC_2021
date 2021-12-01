package main.kotlin

fun main(args: Array<String>)
{
    val input = CommonUtils.readFile("1/src/main/resources/input.txt").map { e -> e.toInt() }
    var increased = 0;
    var prev = 0;
    input.forEachIndexed { index, s ->
        if (index != 0)
        {
            if (s.toInt() > prev)
            {
                increased++
            }
        }
        prev = s.toInt()
    }
    println("Result: $increased")
}

