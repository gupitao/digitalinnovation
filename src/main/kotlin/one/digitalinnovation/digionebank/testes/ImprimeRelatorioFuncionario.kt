package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprimeRelatorio(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}