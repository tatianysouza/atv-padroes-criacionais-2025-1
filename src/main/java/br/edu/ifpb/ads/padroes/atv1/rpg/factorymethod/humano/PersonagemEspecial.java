package br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.humano.PersonagemEspecialAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.PersonagemFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Personagem;

public class PersonagemEspecial implements PersonagemFactory {

    private final String nomeBase;

    public PersonagemEspecial(String nomeBase) {
        this.nomeBase = nomeBase;
    }

    @Override
    public Personagem criar(String ignorado) {
        var factory = new PersonagemEspecialAF(nomeBase);
        return new PersonagemBuilder()
                .comNome(factory.getNome())
                .comRaca(factory.getRaca())
                .comClasse(factory.getClasse())
                .comAtributos(
                        factory.getForca(),
                        factory.getInteligencia(),
                        factory.getAgilidade(),
                        factory.getVida(),
                        factory.getMana()
                )
                .comEquipamentos(factory.criarArma(), factory.criarArmadura())
                .comHabilidades(factory.getHabilidades())
                .construir();
    }
}
