package org.example.chain;

public abstract class SuporteHandler {

    protected SuporteHandler sucessor;

    public void setSucessor(SuporteHandler sucessor) {
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