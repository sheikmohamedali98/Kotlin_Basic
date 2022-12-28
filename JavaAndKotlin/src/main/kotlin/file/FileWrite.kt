package file

import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception


fun main(args: Array<String>) {

    readFile()
    val string = readLine()

    writeTOFile(string)

}

fun writeTOFile(string: String?) {
    var fileWriter: FileWriter? = null
    try {
        fileWriter = FileWriter("text.txt", true)
        fileWriter.write(string)
        println("file saved Sucessfully")
    } catch (ex: Exception) {
        println(ex.message)
    } finally {
        fileWriter?.close()
    }
}

fun readFile(){
    var fileRead:FileReader? = null

    try{
        fileRead = FileReader("text.txt")
        var  character:Int = 0
        do {
            character = fileRead.read()
            print(character.toChar())
        }while (character!=-1)
    }catch (ex:Exception){
        println(ex.message)
    }
}
