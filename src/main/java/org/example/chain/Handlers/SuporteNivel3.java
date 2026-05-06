package org.example.chain.Handlers;

import org.example.chain.Handler.NivelAtendimento;

public class SuporteNivel3 extends NivelAtendimento {

    @Override
    protected String getNivel() {
        return "Nível 3";
    }

    @Override
    protected String getProblema() {
        return "avancado";
    }
}