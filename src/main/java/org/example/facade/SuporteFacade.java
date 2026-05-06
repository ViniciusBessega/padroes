package org.example.facade;

public class SuporteFacade {

    private SistemaAutenticacao autenticacao;
    private SistemaChamado chamado;
    private SistemaNotificacao notificacao;

    public SuporteFacade() {
        autenticacao = new SistemaAutenticacao();
        chamado = new SistemaChamado();
        notificacao = new SistemaNotificacao();
    }

    public void abrirChamado() {

        System.out.println("\n=== ABRINDO CHAMADO ===");

        autenticacao.autenticarUsuario();
        chamado.criarChamado();
        notificacao.enviarNotificacao();

        System.out.println("Chamado aberto com sucesso.");
    }
}