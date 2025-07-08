package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.elfo;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

public class ElfoMagoAF implements PersonagemAF {

    public String getNome() {
        return "Mago Élfico";
    }
    public String getRaca() {
        return "Elfo";
    }

    public String getClasse() {
        return "Mago";
    }

    public int getForca() {
        return 4;
    }

    public int getInteligencia() {
        return 20;
    }

    public int getAgilidade() {
        return 14;
    }

    public int getVida() {
        return 70;
    }

    public int getMana() {
        return 180;
    }

    public Arma criarArma() {
        return new Arma("Cajado da Natureza", 18, "Cajado");
    }

    public Armadura criarArmadura() {
        return new Armadura("Mantos Élficos", 10, "Leve");
    }

    public String[] getHabilidades() {
        return new String[]{"Magia da Natureza", "Teleporte"};
    }
}
