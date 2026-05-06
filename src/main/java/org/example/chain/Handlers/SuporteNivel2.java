package org.example.chain.Handlers;

import org.example.chain.Handler.NivelAtendimento;

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