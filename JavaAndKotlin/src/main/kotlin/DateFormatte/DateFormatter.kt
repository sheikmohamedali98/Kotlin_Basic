package DateFormatte

import java.text.SimpleDateFormat
import java.util.*


class DateFormatter {
}
fun main(args: Array<String>) {
    val simpleDate = SimpleDateFormat("dd/MM/yyyy")
    val currentDate = simpleDate.format(Date())
    println(" Current Date is: " +currentDate)

    println("${"2012.11.1" in "2022.10.5" .. "2003.11.8"}")
    println("${getAge(1998,4,9)}")
}
private fun getAge(year: Int, month: Int, day: Int): String? {
    val dob = Calendar.getInstance()
    val today = Calendar.getInstance()
    dob[year, month] = day
    var age = today[Calendar.YEAR] - dob[Calendar.YEAR]
    if (today[Calendar.DAY_OF_YEAR] < dob[Calendar.DAY_OF_YEAR]) {
        age--
    }
    val ageInt = age
    return ageInt.toString()
}