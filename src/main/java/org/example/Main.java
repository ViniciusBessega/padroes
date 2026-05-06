package org.example;

import org.example.chain.SuporteNivel1;
import org.example.chain.SuporteNivel2;
import org.example.chain.SuporteNivel3;
import org.example.facade.SuporteFacade;
import org.example.strategy.AtendimentoAutomatizado;
import org.example.strategy.AtendimentoDetalhado;
import org.example.strategy.AtendimentoRapido;
import org.example.strategy.ContextoAtendimento;
import org.example.template.AtendimentoComplexo;
import org.example.template.AtendimentoSimples;
import org.example.template.AtendimentoTemplate;

public class Main {

    public static void main(String[] args) {

        System.out.println("PADRÃO FACADE");

        SuporteFacade facade = new SuporteFacade();
        facade.abrirChamado();



        System.out.println("\nPADRÃO CHAIN");

        SuporteNivel1 nivel1 = new SuporteNivel1();
        SuporteNivel2 nivel2 = new SuporteNivel2();
        SuporteNivel3 nivel3 = new SuporteNivel3();

        nivel1.setSucessor(nivel2);
        nivel2.setSucessor(nivel3);

        nivel1.processaChamado("senha");
        nivel1.processaChamado("software");
        nivel1.processaChamado("avancado");



        System.out.println("\nPADRÃO TEMPLATE");

        AtendimentoTemplate simples = new AtendimentoSimples();
        simples.resolverChamado();

        System.out.println();

        AtendimentoTemplate complexo = new AtendimentoComplexo();
        complexo.resolverChamado();



        System.out.println("\nPADRÃO STRATEGY");

        ContextoAtendimento contextoAtendimento;

        contextoAtendimento = new ContextoAtendimento(new AtendimentoRapido());
        contextoAtendimento.executar("Troca de senha");

        contextoAtendimento = new ContextoAtendimento(new AtendimentoDetalhado());
        contextoAtendimento.executar("Erro no sistema");

        contextoAtendimento = new ContextoAtendimento(new AtendimentoAutomatizado());
        contextoAtendimento.executar("Reset automático");
    }
}