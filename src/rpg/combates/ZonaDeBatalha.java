package rpg.combates;

import rpg.armamentos.ArcoEFlecha;
import rpg.armamentos.Armamento;
import rpg.armamentos.Machado;
import rpg.personagens.Arqueiro;
import rpg.personagens.Lenhador;
import rpg.personagens.Mago;
import rpg.personagens.Personagem;

public class ZonaDeBatalha {
    public static void main(String[] args) {
        Armamento machado = new Machado();
        Armamento flecha = new ArcoEFlecha();
        //Armamento armamento = new Armamento();
        // nao pode ser instaciado mas pode ser criado um novo objeto a partir da class armamentos

        Mago mago = new Mago(flecha);
        Lenhador lenhador = new Lenhador(machado);

        Personagem personagem1 = new Lenhador(machado);

        var arcoEFlecha = new ArcoEFlecha();
        var arqueiro = new Arqueiro(arcoEFlecha);


        Personagem.versus(arqueiro, lenhador);

    }
}
