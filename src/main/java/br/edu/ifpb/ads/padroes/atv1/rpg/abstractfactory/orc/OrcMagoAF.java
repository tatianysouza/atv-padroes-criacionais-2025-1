package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.orc;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

public class OrcMagoAF implements PersonagemAF {
    public String getNome() {
        return "Mago Orc";
    }

    public String getRaca() {
        return "Orc";
    }

    public String getClasse() {
        return "Mago";
    }

    public int getForca() {
        return 10;
    }

    public int getInteligencia() {
        return 14;
    }

    public int getAgilidade() {
        return 6;
    }

    public int getVida() {
        return 100;
    }

    public int getMana() {
        return 120;
    }

    public Arma criarArma() {
        return new Arma("Cajado Tribal", 12, "Cajado");
    }

    public Armadura criarArmadura() {
        return new Armadura("Vestes Xamânicas", 6, "Leve");
    }

    public String[] getHabilidades() {
        return new String[]{"Magia Sombria", "Invocação"};
    }
}
