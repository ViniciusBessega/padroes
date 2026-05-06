package org.example.chain;

public class SuporteNivel2 extends NivelAtendimento {

    @Override
    protected String getNivel() {
        return "Nível 2";
    }

    @Override
    protected String getProblema() {
        return "software";
    }
}