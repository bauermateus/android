fun main() {
    fun tri (l1:Int, l2:Int , l3:Int): String {
        return if ((l1 == l2) && (l2 == l3)){
            "Equilatero!"}
        else "Não é Equilatero!"
    }
    println(tri(2,4, 4))
    println(tri(4,4, 4))
}
