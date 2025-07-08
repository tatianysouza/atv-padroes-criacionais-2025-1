package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.elfo;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

public class ElfoGuerreiroAF implements PersonagemAF {

    public String getNome() {
        return "Guerreiro Élfico";
    }

    public String getRaca() {
        return "Elfo";
    }

    public String getClasse() {
        return "Guerreiro";
    }

    public int getForca() {
        return 12;
    }

    public int getInteligencia() {
        return 14;
    }

    public int getAgilidade() {
        return 16;
    }

    public int getVida() {
        return 100;
    }

    public int getMana() {
        return 60;
    }

    public Arma criarArma() {
        return new Arma("Lâmina Élfica", 22, "Espada");
    }

    public Armadura criarArmadura() {
        return new Armadura("Cota de Malha Élfica", 15, "Média");
    }

    public String[] getHabilidades() {
        return new String[]{"Dança das Lâminas", "Agilidade Élfica"};
    }
}
