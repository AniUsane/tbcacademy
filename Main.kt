fun main() {

    var answer = "Y"
    while(answer.equals("Y", ignoreCase = true)){
        println("Enter first string:")
        val string1 = readln()
        println("Enter second string:")
        val string2 = readln()
        val stringNum1 = string1.filter{it.isDigit()}
        val stringNum2 = string2.filter{it.isDigit()}
        val int1:Int
        val int2:Int
        val result:Double

        if(stringNum1.isEmpty()){
            int1 = 0;
            if(stringNum2.isEmpty())
                println("Both numbers are 0. Cannot divide number by zero.")
            else {
                int2= stringNum2.toInt()
                result = int1 / int2.toDouble()
                println("$int1 divided by $int2 is $result")
            }
        }else if(stringNum2.isEmpty()){
            println("Cannot divide number by zero")
        }else{
            int1 = stringNum1.toInt()
            int2 = stringNum2.toInt()
            result = int1.toDouble()/int2.toDouble()
            println("$int1 divided by $int2 is $result")
        }

        println("Do you want to keep the program running? <Y/N>")
        answer = readln()
    }
}