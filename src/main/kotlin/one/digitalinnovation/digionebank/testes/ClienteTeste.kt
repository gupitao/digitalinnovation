package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val gustavo = Cliente("Gustavo Pitao", "123.123.123-11", ClienteTipo.PF, "123456")

    println(gustavo)

    Autenticacao().authentication(gustavo)

}