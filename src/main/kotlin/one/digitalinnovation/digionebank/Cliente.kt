package one.digitalinnovation.digionebank

class Cliente(
    nome:String,
    cpf:String,
    val clienteTipo:ClienteTipo,
    val senha:String
) : Pessoa(nome, cpf), Login {
    override fun signIn(): Boolean = "123456" == senha

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Tipo: ${clienteTipo.descricao}
    """.trimIndent()
}