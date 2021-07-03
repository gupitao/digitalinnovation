package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Gustavo"
    var cpf:String = "123.123.123-11"

    private set

    inner class Endereco{
        var rua:String = "Mitsuzo Tagushi"
        var bairro:String = "Vila Nova"
    }

}

fun main(){
    val pGustavo = Pessoa();

    println(pGustavo.nome);
    println(pGustavo.cpf);
    println(pGustavo.Endereco().rua);
    println(pGustavo.Endereco().bairro);
}
