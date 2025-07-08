package br.edu.ifpb.ads.padroes.atv1.rpg.builder;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.*;

public class PersonagemBuilder {
    private String nome, raca, classe;
    private int forca, inteligencia, agilidade, vida, mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    public PersonagemBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public PersonagemBuilder comRaca(String raca) {
        this.raca = raca;
        return this;
    }

    public PersonagemBuilder comClasse(String classe) {
        this.classe = classe;
        return this;
    }

    public PersonagemBuilder comAtributos(int forca, int inteligencia, int agilidade, int vida, int mana) {
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
        this.vida = vida;
        this.mana = mana;
        return this;
    }

    public PersonagemBuilder comEquipamentos(Arma arma, Armadura armadura) {
        this.arma = arma;
        this.armadura = armadura;
        return this;
    }

    public PersonagemBuilder comHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
        return this;
    }

    public Personagem construir() {
        return new Personagem(nome, raca, classe, forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}
