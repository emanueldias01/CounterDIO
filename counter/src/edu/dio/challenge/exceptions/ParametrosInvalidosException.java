package edu.dio.challenge.exceptions;

public class ParametrosInvalidosException extends Exception {
    private final String lancamento = "Parametros Invalidos";
    private final String mensagem = "O primeiro parametro obrigatoriamente tem que ser menor que o segundo";

    public String getLancamento() {
        return lancamento;
    }

    public String getMensagem() {
        return mensagem;
    }
}
