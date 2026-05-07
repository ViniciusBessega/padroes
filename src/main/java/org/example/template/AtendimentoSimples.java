package org.example.template;

public class AtendimentoSimples extends AtendimentoTemplate {

    @Override
    protected void resolver() {

        System.out.println("Executando diagnóstico simples...");
        System.out.println("Reiniciando...");
        System.out.println("Aplicando correções...");
    }
}