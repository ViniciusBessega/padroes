package org.example.template;

public abstract class AtendimentoTemplate {

    // trecho que vai ser constante e abstrata, definindo o padrão de fluxo
    public final void resolverChamado() {

        abrirChamado();
        identificarProblema();
        analisarChamado();
        resolver();
        testarSolucao();
        finalizarChamado();
    }

    private void abrirChamado() {

        System.out.println("Abrindo chamado...");
    }

    private void identificarProblema() {

        System.out.println("Identificando problema...");
    }

    private void analisarChamado() {

        System.out.println("Analisando chamado...");
    }

    // trecho que vai ser flexível a cada classe do template
    protected abstract void resolver();

    private void testarSolucao() {

        System.out.println("Testando solução...");
    }

    private void finalizarChamado() {

        System.out.println("Finalizando chamado...");
    }
}