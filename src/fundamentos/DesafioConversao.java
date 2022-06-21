package fundamentos;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        //entradas
        System.out.println("Digite seu salario: ");
        String salario1 = entrada.next().replace(",", ".");// trocar "," por "."

        System.out.println("Digite seu salario: ");
        String salario2 = entrada.nextLine();
        salario2 = salario2.replace(",", ".");// trocar "," por "."

        System.out.println("Digite seu salario: ");
        String salario3 = entrada.nextLine();
        salario3 = salario3.replace(",", ".");// trocar "," por "."

        entrada.close();

        //conversao de String para double.
        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario2);

        double resultado = (valor1 + valor2 + valor3) / 3;

        System.out.printf("A média salarial dos ultimos 3 meses é de %.2f", resultado);


    }
}
