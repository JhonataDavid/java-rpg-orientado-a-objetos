package rpg.armamentos;

public class ArcoEFlecha extends Armamento{
    public ArcoEFlecha(){
        this.nome = "Arco de bambu";
        this.dano = 10;
    }

    public String getNome() {
        return nome;
    }
    @Override
    public void ataqueEspecial(){
        this.dano += 70;
    }
}

