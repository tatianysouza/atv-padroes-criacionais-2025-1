package br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.elfo;

import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.elfo.ElfoArqueiroAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.PersonagemFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Personagem;

public class ElfoArqueiro implements PersonagemFactory {
    public Personagem criar(String nome) {
        var factory = new ElfoArqueiroAF();
        return new PersonagemBuilder()
                .comNome(nome)
                .comRaca(factory.getRaca())
                .comClasse(factory.getClasse())
                .comAtributos(factory.getForca(), factory.getInteligencia(), factory.getAgilidade(), factory.getVida(), factory.getMana())
                .comEquipamentos(factory.criarArma(), factory.criarArmadura())
                .comHabilidades(factory.getHabilidades())
                .construir();
    }
}
