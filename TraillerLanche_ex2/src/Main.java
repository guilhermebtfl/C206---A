import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int hora1, hora2, hora3;

        System.out.println("Quantos lanches foram vendidos na primeira hora? ");
        hora1 = entrada.nextInt();
        System.out.println("Quantos lanches foram vendidos na segunda hora?");
        hora2 = entrada.nextInt();
        System.out.println("Quantos lanches foram vendidos na terceira hora?");
        hora3 = entrada.nextInt();

        System.out.println("O total de lanches vendidos foram: " + (hora1+hora2+hora3));
        System.out.println("A média de lanches vendidos foi de: " + (hora1+hora2+hora3)/3);

        entrada.close();
    }
}