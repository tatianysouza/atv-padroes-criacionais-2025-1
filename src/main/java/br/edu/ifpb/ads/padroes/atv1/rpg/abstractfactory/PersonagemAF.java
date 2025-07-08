package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.*;


public interface PersonagemAF {
    String getNome();
    String getRaca();
    String getClasse();
    int getForca();
    int getInteligencia();
    int getAgilidade();
    int getVida();
    int getMana();
    Arma criarArma();
    Armadura criarArmadura();
    String[] getHabilidades();
}
