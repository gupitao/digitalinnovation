package one.digitalinnovation.digionebank

class Gerente(
    nome:String,
    cpf:String,
    salario:Double,
    private val senha:String
) : Funcionario(nome, cpf, salario), Login {
    override fun calculoAuxilio(): Double = salario * 0.5

    override fun signIn() = "123" == senha
}