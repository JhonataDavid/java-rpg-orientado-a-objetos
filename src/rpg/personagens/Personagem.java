package rpg.personagens;

import rpg.armamentos.Armamento;

public abstract class Personagem {
    protected String nome;
    private int life;
    private int level;
    private int xp;
    protected Armamento armamento;

    public Personagem() {
        this.nome = null;
        this.life = 200;
        this.level = 0;
        this.xp = 0;
    }

    public String getNome() {
        return nome;
    }

//    public void setNome(String nome) {
//        this.nome = nome;
//    }

    public int getLife() {
        return life;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void status() {
        System.out.println("-------------------------------------");
        System.out.println("Status: " +
                "\n Nome do Personagem: '" + nome + '\'' +
                ",\n Life: " + life +
                ",\n Level: " + level +
                ",\n Xp: " + xp +
                ",\n Tipo de armamento: " +
                armamento.getNome());
        System.out.println("-------------------------------------");
    }
}
