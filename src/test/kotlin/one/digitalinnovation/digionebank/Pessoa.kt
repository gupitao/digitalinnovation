package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Gustavo"
    var cpf:String = "123.123.123-11"
}

fun main(){
    val pGustavo = Pessoa();

    println(pGustavo.nome);
    println(pGustavo.cpf);
}
