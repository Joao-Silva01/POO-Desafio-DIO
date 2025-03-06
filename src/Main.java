import domain.AparelhoTelefonico;
import domain.NavegadorNaInternet;
import domain.ReprodutorMusical;
import domain.contract.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone rm = new ReprodutorMusical();
        if(rm instanceof ReprodutorMusical){
            ((ReprodutorMusical)rm).selecionarMusica("Mina de Condominio - Seu Jorge");
            ((ReprodutorMusical)rm).tocar();
            ((ReprodutorMusical)rm).pausar();
        }

        System.out.println("\n================\n");

        Iphone at = new AparelhoTelefonico();
        if(at instanceof AparelhoTelefonico){
            ((AparelhoTelefonico)at).ligar("98989898988");
            ((AparelhoTelefonico)at).atender();
            ((AparelhoTelefonico)at).iniciarCorreioVoz();
        }

        System.out.println("\n ================\n");

        Iphone ni = new NavegadorNaInternet();

        if(ni instanceof NavegadorNaInternet){
            ((NavegadorNaInternet)ni).adicionarNovaAba();
            ((NavegadorNaInternet)ni).atualizarPagina();
            ((NavegadorNaInternet)ni).exibirPagina("www.google.com");
        }
    }
}