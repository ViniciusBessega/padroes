package org.example.strategy;

public class AtendimentoRapido implements EstrategiaAtendimento {

    @Override
    public String atender(String chamado) {

        return "Atendimento rápido: " + chamado;
    }
}
