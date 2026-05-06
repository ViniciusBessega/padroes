package org.example.strategy;

public class ContextoAtendimento {

    private EstrategiaAtendimento estrategia;

    public ContextoAtendimento(EstrategiaAtendimento estrategia) {
        this.estrategia = estrategia;
    }

    public void executar(String chamado) {

        System.out.println(
                estrategia.atender(chamado)
        );
    }
}