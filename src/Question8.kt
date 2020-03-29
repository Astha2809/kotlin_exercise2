//Write a program to create HashSet. print all the value.
fun main(args: Array<String>) {
    var hashSetOfAlphabets = hashSetOf<String>("a", "b", "c", "d", "e")
    for (element in hashSetOfAlphabets) {
        println(element)

    }

    println(hashSetOfAlphabets.size)
    println(hashSetOfAlphabets.contains("b"))
}