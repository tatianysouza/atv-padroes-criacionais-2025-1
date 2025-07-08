package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.orc;


import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

public class OrcArqueiroAF implements PersonagemAF {

    public String getNome() {
        return "Arqueiro Orc";
    }

    public String getRaca() {
        return "Orc";
    }

    public String getClasse() {
        return "Arqueiro";
    }

    public int getForca() {
        return 14;
    }

    public int getInteligencia() {
        return 8;
    }

    public int getAgilidade() {
        return 12;
    }

    public int getVida() {
        return 120;
    }

    public int getMana() {
        return 40;
    }
    public Arma criarArma() {
        return new Arma("Arco de Osso", 24, "Arco");
    }

    public Armadura criarArmadura() {
        return new Armadura("Couro de Besta", 16, "Média");
    }

    public String[] getHabilidades() {
        return new String[]{"Tiro Brutal", "Intimidação"};
    }
}
