package br.edu.ifpb.ads.padroes.atv1.rpg.prototype;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Personagem;

import java.util.HashMap;
import java.util.Map;

public class PersonagemPrototype {
    private static final Map<String, Personagem> prototipos = new HashMap<>();

    public static void registrar(String chave, Personagem personagem) {
        prototipos.put(chave.toLowerCase(), personagem);
    }

    public static Personagem clonar(String chave) {
        Personagem original = prototipos.get(chave.toLowerCase());
        if (original == null) {
            throw new IllegalArgumentException("Protótipo não encontrado: " + chave);
        }
        return original.clone();
    }
}
