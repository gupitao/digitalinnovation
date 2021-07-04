package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main(){
    val gustavo = Analista("gustavo", "123.123.123-11", 1000.0)
    ImprimeRelatorioFuncionario.imprimeRelatorio(gustavo)

}