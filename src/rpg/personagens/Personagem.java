package rpg.personagens;

import rpg.armamentos.Armamento;
import rpg.combates.Combate;

public abstract class Personagem implements Combate {
    protected String nome;
    private int life;
    protected int level;
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

    public Armamento getArmamento() {
        return armamento;
    }

    public void setArmamento(Armamento armamento) {
        this.armamento = armamento;
    }

    @Override
    public void atacar(Personagem personagemAtacado) {
        personagemAtacado.life -= armamento.getDano();
        System.out.println("O " + personagemAtacado.getNome() + " foi atacado com " + armamento.getDano() + "de dano");
        System.out.println("Seu nivel atual de vida é de: " + personagemAtacado.getLife());

    }

    @Override
    public void defender(Personagem personagemAtacado) {
        int danoReduzido = armamento.getDano() / 2; // Reduz o dano pela metade ao defender
        personagemAtacado.life -= danoReduzido;
        System.out.println(personagemAtacado.getNome() + " defendeu o ataque! Sofreu " + danoReduzido + " de dano.");
        System.out.println("Vida atual: " + personagemAtacado.getLife());
    }

    @Override
    public void ganhar() {

    }

    @Override
    public void perder() {
    }

    public static void versus(Personagem desafiante, Personagem desafiado) {
        while (desafiante.life > 0 && desafiado.life > 0){
            if (desafiante.level > desafiado.level) {
                desafiante.atacar(desafiado);
            } else if (desafiado.level > desafiante.level) {
                desafiado.defender(desafiado);
                System.out.println("O " + desafiado.getNome() + " defendeu o ataque do " + desafiante.getNome());
            }
        }
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
