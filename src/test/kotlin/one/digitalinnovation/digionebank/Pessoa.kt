package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Gustavo"
    var cpf:String = "123.123.123-11"
    private set

    constructor()

    fun pessoaInfo() = "Nome: $nome, CPF: $cpf"
}

fun main(){
    val pGustavo = Pessoa();

    println(pGustavo.pessoaInfo());
}
