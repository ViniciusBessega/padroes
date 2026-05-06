package org.example.template;

public class AtendimentoComplexo extends AtendimentoTemplate {

    @Override
    protected void resolver() {

        System.out.println("Executando diagnóstico avançado...");
        System.out.println("Reinstalando sistema...");
        System.out.println("Aplicando correções...");
    }
}