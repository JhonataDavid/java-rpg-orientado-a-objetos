package rpg.combates;

import rpg.personagens.Personagem;

public interface Combate {
    void atacar(Personagem personagemAtacante);

    void defender(Personagem personagemDefender);

    void ganhar();

    void perder();

    void versus(Personagem p1, Personagem p2);
}
