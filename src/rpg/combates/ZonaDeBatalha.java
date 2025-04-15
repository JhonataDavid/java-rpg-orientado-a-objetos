package rpg.combates;

import rpg.armamentos.ArcoEFlecha;
import rpg.armamentos.Armamento;
import rpg.armamentos.Machado;
import rpg.personagens.Lenhador;
import rpg.personagens.Mago;

public class ZonaDeBatalha {
    public static void main(String[] args) {
        Armamento machado = new Machado();
        Armamento flecha = new ArcoEFlecha();
        //Armamento armamento = new Armamento();
        // nao pode ser instaciado mas pode ser criado um novo objeto a partir da class armamentos

        Mago mago = new Mago(machado);
        Lenhador lenhador = new Lenhador(flecha);

        lenhador.status();
        mago.status();
    }
}
