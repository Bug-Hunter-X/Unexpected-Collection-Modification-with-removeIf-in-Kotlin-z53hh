fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it % 2 != 0 }
    println(list) // Output: [1, 2, 3, 4, 5] - original list unchanged
    println(newList) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val newMap = map.filterValues { it % 2 != 0 }
    println(map) //Output: {a=1, b=2, c=3} - original map unchanged
    println(newMap) // Output: {a=1, c=3}

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val newSet = set.filter { it % 2 != 0 }
    println(set) //Output: [1, 2, 3, 4, 5] - original set unchanged
    println(newSet) // Output: [1, 3, 5]
}