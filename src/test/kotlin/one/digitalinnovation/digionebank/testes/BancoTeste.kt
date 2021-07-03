package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco("Digione", 12);
    digiOneBank.info()

    val banco2 = digiOneBank.copy("pitao")
    banco2.info()
}
