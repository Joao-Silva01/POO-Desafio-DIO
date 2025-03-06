package domain;

import domain.contract.Iphone;

public class ReprodutorMusical implements Iphone {
    private String musicaTocando;

    private String getMusicaTocando() {
        return musicaTocando;
    }

    private void setMusicaTocando(String musicaTocando) {
        this.musicaTocando = musicaTocando;
    }

    public void tocar() {
        if (musicaTocando != null) {
            System.out.println("Tocando a musica: " + getMusicaTocando());
        } else {
            System.out.println("Nenhuma música foi selecionada");
        }
    }

    public void pausar() {
        if (musicaTocando != null) {
            System.out.println("Pausando a música: " + getMusicaTocando());
        }else {
            System.out.println("Nenhuma música foi selecionada");
        }
    }

    public void selecionarMusica(String musica) {
        setMusicaTocando(musica);
        System.out.println("Selecionando a música: " + getMusicaTocando());
    }
}
