// solution to the problem Plus or Minus at Codeforces in Kotlin
fun main() {
    (1..readln().toInt()).forEach { _ ->
        val (a, b, c) = readln().split(" ").map { it.toInt() }
        println(if(a + b == c) "+" else "-")
    }
}
