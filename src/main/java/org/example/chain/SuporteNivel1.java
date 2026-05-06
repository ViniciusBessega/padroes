package org.example.chain;

public class SuporteNivel1 extends SuporteHandler {

    @Override
    protected String getNivel() {
        return "Nível 1";
    }

    @Override
    protected String getProblema() {
        return "senha";
    }
}
