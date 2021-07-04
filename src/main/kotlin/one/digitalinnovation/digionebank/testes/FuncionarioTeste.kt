package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val pGustavo = Pessoa("gustavo", "123.123.123-11");

    println(pGustavo.nome);
    println(pGustavo.cpf);

    val fGustavo = Funcionario("gustavo", "123.123.123-11", BigDecimal.valueOf(2000.0))
    println(fGustavo.nome);
    println(fGustavo.cpf);
    println(fGustavo.salario);
}
