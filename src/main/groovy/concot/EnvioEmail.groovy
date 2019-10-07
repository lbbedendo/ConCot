package concot

import grails.validation.Validateable

class EnvioEmail implements Validateable {

    Fornecedor fornecedor
    String email
    String mensagem

    static constrains = {
        fornecedor nullable: false
        email nullable: false, blank: false, email: true
        mensagem nullable: false, blank: false
    }
}
