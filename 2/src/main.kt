fun main()
{
    val input = parseInput(CommonUtils.readFile("2/src/input1.txt"))
    var depth = 0
    var horizontal = 0
    input.forEach {
        when (it.first)
        {
            Movement.UP -> depth -= it.second
            Movement.DOWN -> depth += it.second
            Movement.FORWARD -> horizontal += it.second
        }
    }
    println("Result: Horizontal: $horizontal Depth: $depth")
    println("Multiplied: " + horizontal * depth)
}


fun parseInput(input: List<String>): List<Pair<Movement, Int>>
{
    val result: MutableList<Pair<Movement, Int>> = mutableListOf()
    input
        .map { it.split(" ") }
        .map {
            when (it[0])
            {
                "down" -> result.add(Pair(Movement.DOWN, it[1].toInt()))
                "up" -> result.add(Pair(Movement.UP, it[1].toInt()))
                "forward" -> result.add(Pair(Movement.FORWARD, it[1].toInt()))
                else -> throw RuntimeException("error parsing input list")
            }
        }

    return result
}

enum class Movement(type: String)
{
    DOWN("down"),
    UP("up"),
    FORWARD("forward");
}