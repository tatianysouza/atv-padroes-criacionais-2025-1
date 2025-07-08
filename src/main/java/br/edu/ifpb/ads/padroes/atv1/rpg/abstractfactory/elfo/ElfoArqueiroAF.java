package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.elfo;


import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

public class ElfoArqueiroAF implements PersonagemAF {

    public String getNome() {
        return "Arqueiro Élfico";
    }

    public String getRaca() {
        return "Elfo";
    }

    public String getClasse() {
        return "Arqueiro";
    }

    public int getForca() {
        return 8;
    }

    public int getInteligencia() {
        return 16;
    }

    public int getAgilidade() {
        return 20;
    }

    public int getVida() {
        return 90;
    }

    public int getMana() {
        return 100;
    }

    public Arma criarArma() {
        return new Arma("Arco Longo Élfico", 28, "Arco");
    }

    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro Élfico", 14, "Média");
    }

    public String[] getHabilidades() {
        return new String[]{"Tiro Múltiplo", "Camuflagem"};
    }
}
