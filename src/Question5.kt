/*Write a function which take marks as an argument and return the the grade as follows:
marks between 50 to 60 , return “Good”
marks between 60 to 70, return “Very Good”
marks between 70 to  80, return “Excellent”
marks between  80 to 100, return “Rockstar”*/


fun results(marks: Int) {
    if (marks >= 50 && marks < 60) {
        println("Good")
    } else if (marks >= 60 && marks < 70) {
        println("VeryGood")
    } else if (marks >= 70 && marks < 80) {
        println("Excellent")
    } else {
        println("ROckstar")
    }

}

fun main(args: Array<String>) {
    println("Enter marks")
    var marks = readLine()!!.toInt()
    var grades = results(marks)
    println(grades)
}