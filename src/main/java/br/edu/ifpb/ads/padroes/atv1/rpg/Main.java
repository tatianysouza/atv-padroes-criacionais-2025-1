package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.humano.HumanoGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.elfo.ElfoMago;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.orc.OrcArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.humano.PersonagemEspecial;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.PersonagemPrototype;

public class Main {
    public static void main(String[] args) {
        // Crian os personagens
        Personagem guerreiro = new HumanoGuerreiro().criar("Tatiany");
        Personagem magoElfo = new ElfoMago().criar("Manu");
        Personagem arqueiroOrc = new OrcArqueiro().criar("Everton");
        Personagem lendario = new PersonagemEspecial("André").criar(null);

        // Registro de protótipos
        PersonagemPrototype.registrar("guerreiro_humano", guerreiro);
        PersonagemPrototype.registrar("mago_elfo", magoElfo);
        PersonagemPrototype.registrar("arqueiro_orc", arqueiroOrc);
        PersonagemPrototype.registrar("guerreiro_lendario", lendario);

        // Clone
        Personagem clone1 = PersonagemPrototype.clonar("guerreiro_humano");

        System.out.println("Personagens: ");
        System.out.println(guerreiro);
        System.out.println(magoElfo);
        System.out.println(arqueiroOrc);
        System.out.println(lendario);

        System.out.println("\nClones: ");
        System.out.println(clone1);

    }
}
