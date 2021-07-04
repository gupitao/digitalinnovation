package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Login

class Autenticacao {
    fun authentication(login: Login) = println(login.signIn())
}