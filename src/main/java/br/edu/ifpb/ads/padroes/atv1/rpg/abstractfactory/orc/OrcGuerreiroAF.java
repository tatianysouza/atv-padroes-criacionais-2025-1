package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.orc;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

public class OrcGuerreiroAF implements PersonagemAF {
    public String getNome() {
        return "Guerreiro Orc";
    }

    public String getRaca() {
        return "Orc";
    }

    public String getClasse() {
        return "Guerreiro";
    }

    public int getForca() {
        return 20;
    }

    public int getInteligencia() {
        return 6;
    }

    public int getAgilidade() {
        return 8;
    }

    public int getVida() {
        return 150;
    }

    public int getMana() {
        return 20;
    }

    public Arma criarArma() {
        return new Arma("Machado de Guerra", 30, "Machado");
    }

    public Armadura criarArmadura() {
        return new Armadura("Armadura Brutal", 25, "Pesada");
    }

    public String[] getHabilidades() {
        return new String[]{"Fúria", "Pancada Devastadora"};
    }
}
