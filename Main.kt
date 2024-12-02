fun main() {
//გადმოცემულ სტრინგში ამოწმებს თუ არის '$' სიმბოლო
//    println("Enter string:")
//    val string = readln()
//    println(findSymbol(string))

//ფუნქცია ითვლის 100მდე ნებისმიერი რიცხვისთვის ყველა ლუწი რიცხვების ჯამს
//    println("Enter number which is lower or equal to 100:")
//    val number = readln().toInt()
//    println(evenAdd(number))

//მიღებულ რიცხვს აბრუნებს მიღებული რიცხვის შებრუნებულს
//    println("Enter number:")
//    val number = readln().toInt()
//    println(reverseNumber(number))

//ფუნქცია ამოწმებს პოლინდრომია თუ არა გადმოცემული რიცხვი
//    println("Enter number to check whether it is palindrome or not:")
//    val number = readln().toInt()
//    println(detectPalindrome(number))

//    უსგ-ს პოვნა
//    println("Enter the first number:")
//    val num1 = readln().toInt()
//    println("Enter the second number:")
//    val num2 = readln().toInt()
//    println(findGCD(num1, num2))

//    უსჯ-ს პოვნა
//    println("Enter the first number:")
//    val num1 = readln().toInt()
//    println("Enter the second number:")
//    val num2 = readln().toInt()
//    println(findLCM(num1, num2))
}


//უსჯ-ს პოვნა
fun findLCM(num1: Int, num2: Int):Int {
    val GCD = findGCD(num1, num2)
    val LCM = (num1 * num2) / GCD
    return LCM
}


//უსგ-ს პოვნა
fun findGCD(a: Int, b: Int): Int {
    var num1 = a
    var num2 = b

    while (num2 != 0) {
        val remainder = num1 % num2
        num1 = num2
        num2 = remainder
    }

    return num1 // GCD არის num1
}


//ფუნქცია ამოწმებს პოლინდრომია თუ არა გადმოცემული რიცხვი
fun detectPalindrome(number: Int): String {
    val reversed = number.toString().reversed()
    return if(number == reversed.toInt()) "Palindrome" else "Not Palindrome"
}


//მიღებულ რიცხვს აბრუნებს მიღებული რიცხვის შებრუნებულს
fun reverseNumber(number: Int): Int {
    val reversed = number.toString().reversed()
    return reversed.toInt()

}


//ფუნქცია ითვლის 100მდე ნებისმიერი რიცხვისთვის ყველა ლუწი რიცხვების ჯამს
fun evenAdd(number: Int): Int {
    var count = 0
    for(i in 0..number){
        if (i % 2 == 0)
            count += i
    }
    return count
}


//გადმოცემულ სტრინგში ამოწმებს თუ არის '$' სიმბოლო
fun findSymbol(string: String): String {
    val message:String
    if(string.contains('$'))
        message = "'\$' is detected in the string."
    else
        message = "'\$' is not in the given string."
    return message
}

