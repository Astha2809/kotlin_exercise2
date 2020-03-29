//Write a program to print your Firstname,LastName & age using init block,companion object.

class Question1 {
    init {
        var first_name = "Astha"
        println("first name is : $first_name")
        var last_name = "Singh"
        println("Last name is : $last_name")

    }

    companion object {
        fun printAge() = println("Age is 21")
    }
}

fun main(args: Array<String>) {
    var question1 = Question1()
    print(Question1.printAge())
}