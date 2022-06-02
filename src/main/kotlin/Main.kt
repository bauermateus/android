fun main() {
    fun YearsTo (years: Int): Unit {
        val meses = years * 12
        val dias = years * 365
        val horas = dias * 24
        val minutos = horas * 60
        val segundos = minutos * 60
        println("${meses} meses, ${dias} dias, ${horas} horas, ${minutos} minutos, e ${segundos} segundos.")

    }
    YearsTo(2)


}