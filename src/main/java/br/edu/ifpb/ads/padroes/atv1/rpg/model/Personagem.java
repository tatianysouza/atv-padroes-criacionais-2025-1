package br.edu.ifpb.ads.padroes.atv1.rpg.model;
import java.util.Arrays;

public class Personagem implements Cloneable {
    private String nome, raca, classe;
    private int forca, inteligencia, agilidade, vida, mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    public Personagem(String nome, String raca, String classe, int forca, int inteligencia, int agilidade, int vida, int mana, Arma arma, Armadura armadura, String[] habilidades) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
        this.vida = vida;
        this.mana = mana;
        this.arma = arma;
        this.armadura = armadura;
        this.habilidades = habilidades;
    }

    @Override
    public Personagem clone() {
        try {
            Personagem clone = (Personagem) super.clone();
            clone.habilidades = habilidades.clone();
            clone.arma = arma.clone();
            clone.armadura = armadura.clone();
            return clone;
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


    public String getNome() {
        return nome;
    }
    public String getRaca() {
        return raca;
    }
    public String getClasse() {
        return classe;
    }
    public int getForca() {
        return forca;
    }
    public int getInteligencia() {
        return inteligencia;
    }
    public int getAgilidade() {
        return agilidade;
    }
    public int getVida() {
        return vida;
    }
    public int getMana() {
        return mana;
    }
    public Arma getArma() {
        return arma;
    }
    public Armadura getArmadura() {
        return armadura;
    }
    public String[] getHabilidades() {
        return habilidades;
    }

    @Override
    public String toString() {
        return String.format("%s - %s %s (F:%d, I:%d, A:%d, V:%d, M:%d)", nome, raca, classe, forca, inteligencia, agilidade, vida, mana);
    }
}
