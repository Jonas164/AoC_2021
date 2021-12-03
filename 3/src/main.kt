fun main()
{
    val input = CommonUtils.readFile("3/src/input1.txt")
    val gamma = calcGamma(input)
    val epsilon = calcEpsilon(input)
    println("Gamma: $gamma  Epsilon: $epsilon  Result: ${gamma*epsilon}")
}


fun calcGamma(input: List<String>): Int
{
    val bitAccList: MutableList<Int> = MutableList(input[0].length) { 0 }
    var result = ""
    for (i in input.indices)
    {
        input[i].forEachIndexed { index, e ->
            bitAccList[index] += e.code - 48
        }
    }
    bitAccList.forEach {
        result += if (input.size < it * 2)
        {
            "1"
        }
        else
        {
            "0"
        }
    }
    return Integer.parseInt(result, 2)
}

fun calcEpsilon(input: List<String>): Int
{
    val bitAccList: MutableList<Int> = MutableList(input[0].length) { 0 }
    var result = ""
    for (i in input.indices)
    {
        input[i].forEachIndexed { index, e ->
            bitAccList[index] += e.code - 48
        }
    }
    bitAccList.forEach {
        if (input.size > it * 2)
        {
            result += "1"
        }
        else
        {
            result += "0"
        }
    }
    return Integer.parseInt(result, 2)
}
