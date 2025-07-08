package br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Personagem;

public interface PersonagemFactory {
    Personagem criar(String nome);
}
