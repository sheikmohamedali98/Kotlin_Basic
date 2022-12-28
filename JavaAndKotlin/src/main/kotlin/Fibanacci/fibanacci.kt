package Fibanacci

class Fibanacci {

tailrec  fun recursion(n: Int): Int {
        if (n < 2) {
            return n
        }
        return recursion(n - 1).plus(recursion(n - 2))
    }

    fun fibanaccinu(num: Int) {
        var num1: Int = 0
        var num2: Int = 1
        print(" $num1  $num2")

        for (i in 2..num) {
            var num3: Int = num1.plus(num2)
            print(" $num3")
            num1 = num2;
            num2 = num3;
        }
    }

    fun numberCheck(num: Int):String {

      var str:String =  when(num) {
            in 100 until 200 -> "$num number is less than 200"
            in 200 until 300 -> "$num number is less than 300"
            in 300 until 400 -> "$num number is less than 400"
            in 400 until 500 -> "$num number is less than 500"
            in 500 until 600 -> "$num number is less than 600"
            in 600 until 700 ->"$num number is less than 700"
            in 700 until 800 -> "$num number is less than 800"
            in 800 until 900 ->"$num number is less than 900"
            in 900 until 1000 -> "$num number is less than 1000"

          else -> "Enter Valid number"
      }

        return str;
    }


    fun frequency(num:Int):Int{
        var count:Int = 0
        var temp:Int = num
        while(temp!=0){
            var reminder:Int = temp%10
            if(reminder.equals(4)){
                count++;
            }
            temp = temp.div(10)
        }
        return count
    }


}





