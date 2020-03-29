/*Write a single program for following operation using overloading
A) Adding 2 integer number
B) Adding 2 double
D) multiplying 2 int
E) concate 2 string
F) Concate 3 String */


fun add(a: Int, b: Int) {
    var sum_of_integers: Int = a + b
    println("sum of integers=:$sum_of_integers")
}

fun add(a: Double, b: Double) {
    var sum_of_double: Double = a + b
    println("sum of double=: $sum_of_double")
}

fun multiply(a: Int, b: Int) {
    var multiplication: Int = a * b
    println("mutiplication= :$multiplication")
}

fun concatString(a: String, b: String) {
    var newString: String = a.plus(" ").plus(b)
    println("new string is :$newString")
}

fun concatString(a: String, b: String, c: String) {
    var newString1 = a.plus(" ").plus(b)
    var newString2 = newString1.plus(" ").plus(c)
    println("new string is :$newString2")

}

fun main(args: Array<String>) {

    add(2, 3)
    add(1.2, 1.1)
    multiply(2, 4)
    concatString("abc", "def")
    concatString("abc", "def", "ghi")
}

