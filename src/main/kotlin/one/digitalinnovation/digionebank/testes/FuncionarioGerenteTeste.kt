package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.Funcionario

fun main(){
    val gustavo = Gerente("gustavo", "123.123.123-11", 5000.0)
    ImprimeRelatorioFuncionario.imprimeRelatorio(gustavo)

}