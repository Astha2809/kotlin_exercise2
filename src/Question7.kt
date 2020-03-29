//Write a program to create mutable map. print all the value and key of map.

fun main(args: Array<String>) {
    val map = mutableMapOf(1 to "name", 2 to "age", 3 to "marks", 4 to "department")
    println("Map entries :" + map.entries)
    println("Map values :" + map.values)
    println("Map keys :" + map.keys)

}