package rpg.armamentos;

public abstract class Armamento{
    protected String nome;
    protected int dano;

    public Armamento(){
        this.nome = null;
        this.dano = 0;
    }

    public String getNome() {
        return nome;
    }

    public void ataqueEspecial(){

    }
}