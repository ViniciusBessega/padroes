package org.example.chain;

public class SuporteNivel3 extends SuporteHandler {

    @Override
    protected String getNivel() {
        return "Nível 3";
    }

    @Override
    protected String getProblema() {
        return "avancado";
    }
}