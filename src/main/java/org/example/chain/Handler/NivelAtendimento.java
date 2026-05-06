package org.example.chain.Handler;

public abstract class NivelAtendimento {

    protected NivelAtendimento sucessor;

    public void setSucessor(NivelAtendimento sucessor) {
        this.sucessor = sucessor;
    }

    protected abstract String getNivel();

    protected abstract String getProblema();

    public void processaChamado(String problema) {

        if (problema.equalsIgnoreCase(getProblema())) {

            System.out.println(getNivel() +
                    " resolveu o problema de " + problema);

        } else if (sucessor != null) {

            sucessor.processaChamado(problema);

        }
    }
}