package org.example.strategy;

public class AtendimentoDetalhado implements EstrategiaAtendimento {

    @Override
    public String atender(String chamado) {

        return "Atendimento detalhado: " + chamado;
    }
}