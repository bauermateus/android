fun main() {
    uptolow("aaAAJDJDJIJFSAAKJDSJAAejkfijefDGRTGJHRTGoiAAA")
}
fun uptolow (str: String):Unit {
    val rep: String = str
    println(rep.replace("a", "x", true).lowercase())
}