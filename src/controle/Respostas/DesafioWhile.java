package controle.Respostas;
import java.util.Scanner;
public class DesafioWhile {
    int notaValida = 0;//Quantidade de notas validas foram inseridas no sistema
    int total = 0;//Soma de todas as notas
    int valor = 0;
    public DesafioWhile() {
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.print("Entre com a nota do aluno: ");
            valor = entrada.nextInt();

            if (valor >= 0 && valor <= 10) {
                notaValida++;//somar quantidade de validas
                total += valor;
            }
        }
        while (valor != -1);
        System.out.println("Mostrando nota final");
        System.out.println("Entrada de notas: " + notaValida + " pontos.");
        System.out.println("Valor total de notas: " + total + " pontos.");
        System.out.println("Media da sala: " + total / notaValida + " pontos.");
        entrada.close();
    }

    public static void main(String[] args){DesafioWhile p = new DesafioWhile();}
}
