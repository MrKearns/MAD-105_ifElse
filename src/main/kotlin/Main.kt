import kotlin.math.abs

fun main(args: Array<String>) {

    var temperature = 0.0
    var checkAnother = ""

       while (checkAnother != "N") {
           print("Enter the current temperature: ")

           temperature = readln().toDouble()

           if (temperature < 97.5)
               println("Temp is low")
           else if (temperature in 97.5..99.5)
               println("Temp is normal")
           else if (temperature > 99.5)
               println("Temp is high")

           println("Check another temp? y or n")
           checkAnother = readln()
       }


}