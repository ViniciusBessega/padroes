package org.example.template;

public abstract class AtendimentoTemplate {

    // TEMPLATE METHOD
    public final void resolverChamado() {

        identificarProblema();
        resolver();
        finalizar();
    }

    private void identificarProblema() {
        System.out.println("Identificando problema...");
    }

    protected abstract void resolver();

    private void finalizar() {
        System.out.println("Finalizando atendimento...");
    }
}