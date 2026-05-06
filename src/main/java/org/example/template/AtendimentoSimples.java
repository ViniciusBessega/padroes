package org.example.template;

public class AtendimentoSimples extends AtendimentoTemplate {

    @Override
    protected void resolver() {

        System.out.println("Executando diagnóstico avançado...");
        System.out.println("Reinstalando sistema...");
        System.out.println("Aplicando correções...");
    }
}