package br.edu.ifpb.ads.padroes.rpg.config;

public class ConfiguracaoJogo {

    private int nivelDificuldade;

    public ConfiguracaoJogo() {
        this.nivelDificuldade = 1;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivel) {
        this.nivelDificuldade = nivel;
    }

}
