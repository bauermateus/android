/*
* Escreva um programa para ser usado na de portaria de um evento.
a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
permitidos.”.
b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum
destes. Mensagem: “Negado. Convite inválido.”.
c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam com “XT”.
Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite inválido.”.
d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”.

* */

fun main() {
    fun portaria(idade: Int, conv: String, cod: String): String {
        return if (idade >= 18) {
            if ((conv.lowercase() == "comum" && cod.uppercase() == "XT") || (conv.lowercase() == "premium"
                        || conv.lowercase() == "luxo" && cod.uppercase() == "XL")) {
                "Welcome :)"
            } else {
                "Negado. Convite inválido."
            }
        } else {
            "Negado. Menores de idade não são permitidos."
        }
    }
    println(portaria(17, "luxo", "XL"))
    println(portaria(18, "comum", "XL"))
    println(portaria(18, "premium", "XL"))
    println(portaria(18, "premium", "xl"))
    println(portaria(18, "PREMIUM", "xl"))
    println(portaria(18, "comUm", "XT"))
}
//MENOR, NEG, WELC, WELC, WELC, WELC