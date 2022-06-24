package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.printf("%d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine(); //coloca a entrada em uma variavel

        System.out.printf("Seu nome é %s",nome); //escreve na tela o que foi colocado na var nome

        entrada.close();//fecha o scanner, para nao ficar ocupando recursos na maquina


    }
}
