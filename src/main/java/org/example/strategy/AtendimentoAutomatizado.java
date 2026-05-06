package org.example.strategy;

public class AtendimentoAutomatizado implements EstrategiaAtendimento {

    @Override
    public String atender(String chamado) {

        return "Atendimento automatizado: " + chamado;
    }
}
