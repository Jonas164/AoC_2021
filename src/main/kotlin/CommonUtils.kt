import java.io.File

class CommonUtils
{
    companion object Factory
    {
        fun readFile(fileName: String): List<String>
                = File(fileName).readLines()
    }

}