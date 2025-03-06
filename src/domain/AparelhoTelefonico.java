package domain;

import domain.contract.Iphone;

public class AparelhoTelefonico implements Iphone {

    private String numero;

    private String getNumero() {
        return numero;
    }

    private void setNumero(String numero) {
        this.numero = numero;
    }

    public void ligar(String numero) {
        setNumero(numero);
        System.out.println("ligando para o número: " + getNumero());
    }

    public void atender() {
        System.out.println("Atendendo o telefone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz");
    }
}
