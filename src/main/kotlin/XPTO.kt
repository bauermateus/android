import java.util.*
import kotlin.math.round

fun main() {
    fun XPTO (cargo : String, tempoAnos: Float): String {
        val ger = "Bonus = R$2000"
        val ger2y = "Bonus = R$3000"
        val coord = "Bonus = R$1500"
        val coord1y = "Bonus = R$1800"
        val eng = "Bonus = R$1000"
        val est = "Bonus = R$500"
        if ((cargo.lowercase() == "ger") && (tempoAnos < 2.0)) {
            return ger
        } else if ((cargo.lowercase() == "ger") && (tempoAnos >= 2.0)){
            return ger2y
    }
        else if ((cargo.lowercase() == "coord") && (tempoAnos < 1.0)) {
            return coord
        }
        else if ((cargo.lowercase() == "coord") && (tempoAnos >= 1.0)) {
            return coord1y
        }
        else if (cargo.lowercase() == "eng") {
            return eng
        }
        else if (cargo.lowercase() == "est") {
            return est
        }
        else return "erro! digite um entre: ger, coord,  eng, ou est."
}
    println(XPTO("eng", 1.0f))
    println(XPTO("EST", 1.1f))
    println(XPTO("CoOrd", 5.5f))
    println(XPTO("hahahahahah", 2f))
    println(XPTO("ger", 2.5f))
    println(XPTO("ger", 1.9f))
}