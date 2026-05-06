package org.example.chain.Handlers;

import org.example.chain.Handler.NivelAtendimento;

public class SuporteNivel1 extends NivelAtendimento {

    @Override
    protected String getNivel() {
        return "Nível 1";
    }

    @Override
    protected String getProblema() {
        return "senha";
    }
}
