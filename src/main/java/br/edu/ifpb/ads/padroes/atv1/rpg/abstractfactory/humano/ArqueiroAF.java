package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

public class ArqueiroAF implements PersonagemAF {

    public String getNome() {
        return "Arqueiro Humano";
    }

    public String getRaca() {
        return "Humano";
    }

    public String getClasse() {
        return "Arqueiro";
    }

    public int getForca() {
        return 10;
    }

    public int getInteligencia() {
        return 12;
    }

    public int getAgilidade() {
        return 16;
    }

    public int getVida() {
        return 100;
    }

    public int getMana() {
        return 70;
    }

    public Arma criarArma() {
        return new Arma("Arco Élfico", 20, "Arco");
    }

    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro", 12, "Média");
    }

    public String[] getHabilidades() {
        return new String[]{"Tiro Certeiro", "Chuva de Flechas"};
    }
}
