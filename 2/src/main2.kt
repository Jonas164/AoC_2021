fun main()
{
    val input = parseInput(CommonUtils.readFile("2/src/input2.txt"))
    var depth = 0
    var horizontal = 0
    var aim = 0
    input.forEach{
        when (it.first)
        {
            Movement.UP -> aim -= it.second
            Movement.DOWN -> aim += it.second
            Movement.FORWARD -> {
                horizontal += it.second
                depth += aim * it.second
            }
        }
    }
    println("Result: Horizontal: $horizontal Depth: $depth Aim: $aim")
    println("Multiplied: " + horizontal * depth)
}