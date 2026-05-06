package org.example;

import org.example.chain.Handlers.SuporteNivel1;
import org.example.chain.Handlers.SuporteNivel2;
import org.example.chain.Handlers.SuporteNivel3;
import org.example.facade.SuporteFacade;
import org.example.strategy.AtendimentoAutomatizado;
import org.example.strategy.AtendimentoDetalhado;
import org.example.strategy.AtendimentoRapido;
import org.example.strategy.ContextoAtendimento;
import org.example.template.AtendimentoComplexo;
import org.example.template.AtendimentoSimples;
import org.example.template.AtendimentoTemplate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int problemaOpcao;

        String problema = "";

        System.out.println("=== SISTEMA DE SUPORTE ===");


        System.out.println("\nQual o problema?");
        System.out.println("1 - Troca de senha");
        System.out.println("2 - Problema de software");
        System.out.println("3 - Problema avançado");

        problemaOpcao = scanner.nextInt();

        switch (problemaOpcao) {
            case 1:
                problema = "senha";

                executarFacade(problema);
                executarChain(problema);
                executarTemplate(problema);
                executarStrategy(problema);
                break;
            case 2:
                problema = "software";

                executarFacade(problema);
                executarChain(problema);
                executarTemplate(problema);
                executarStrategy(problema);
                break;
            case 3:
                problema = "avancado";

                executarFacade(problema);
                executarChain(problema);
                executarTemplate(problema);
                executarStrategy(problema);
                break;
        }
        scanner.close();
    }

    public static void executarFacade(String problema) {

        System.out.println("\n=== FACADE ===");

        SuporteFacade facade = new SuporteFacade();
        facade.abrirChamado();

        System.out.println("Problema registrado: " + problema);
    }


    public static void executarChain(String problema) {

        System.out.println("\n=== CHAIN OF RESPONSIBILITY ===");

        SuporteNivel1 n1 = new SuporteNivel1();
        SuporteNivel2 n2 = new SuporteNivel2();
        SuporteNivel3 n3 = new SuporteNivel3();

        n1.setSucessor(n2);
        n2.setSucessor(n3);

        n1.processaChamado(problema);
    }

    // =========================
    // TEMPLATE
    // =========================
    public static void executarTemplate(String problema) {

        System.out.println("\n=== TEMPLATE METHOD ===");

        AtendimentoTemplate atendimento;

        if (problema.equals("senha")) {
            atendimento = new AtendimentoSimples();
        } else {
            atendimento = new AtendimentoComplexo();
        }

        atendimento.resolverChamado();
    }

    // =========================
    // STRATEGY
    // =========================
    public static void executarStrategy(String problema) {

        System.out.println("\n=== STRATEGY ===");

        ContextoAtendimento executor;

        if (problema.equals("senha")) {
            executor = new ContextoAtendimento(new AtendimentoRapido());
        } else if (problema.equals("software")) {
            executor = new ContextoAtendimento(new AtendimentoDetalhado());
        } else {
            executor = new ContextoAtendimento(new AtendimentoAutomatizado());
        }

        executor.executar(problema);
    }
}