package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

public class PersonagemEspecialAF implements PersonagemAF {

    private final String nome;

    public PersonagemEspecialAF(String nomeBase) {
        this.nome = nomeBase + " o Lendário";
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getRaca() {
        return "Humano";
    }

    @Override
    public String getClasse() {
        return "Guerreiro";
    }

    @Override
    public int getForca() {
        return 18;
    }

    @Override
    public int getInteligencia() {
        return 10;
    }

    @Override
    public int getAgilidade() {
        return 12;
    }

    @Override
    public int getVida() {
        return 140;
    }

    @Override
    public int getMana() {
        return 40;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Excalibur", 35, "Espada");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura do Rei", 30, "Pesada");
    }

    @Override
    public String[] getHabilidades() {
        return new String[]{"Investida", "Bloqueio", "Liderança"};
    }
}
