package rpg.personagens;

import rpg.armamentos.Armamento;

public class Lenhador extends Personagem {
    public Lenhador(Armamento armamento) {
        this.armamento = armamento;
        this.nome = "Corta vara";
        this.level = 2;
    }
}
