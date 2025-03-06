package domain;

import domain.contract.Iphone;

public class NavegadorNaInternet implements Iphone {

    public void exibirPagina(String url){
        System.out.println("Exibindo a url: "+ url);
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando uma nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando a pagina");
    }
}
