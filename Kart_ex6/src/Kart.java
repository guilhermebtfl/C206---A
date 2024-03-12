public class Kart {

    String nome;
    Motor motor;
    Piloto piloto;

    public Kart(){

        this.motor = new Motor();

    }

    void pular(){

        System.out.println("Pulando...");

    }

    void soltarTurbo(){

        System.out.println("Soltando turbo...");
    }

    void darDrift(){

        System.out.println("Dando drift...");

    }
}
