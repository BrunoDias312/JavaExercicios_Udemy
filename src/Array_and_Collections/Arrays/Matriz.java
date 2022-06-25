package Array_and_Collections.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos alunos: ");
        int qtdAlunos = entrada.nextInt();

        System.out.print("Notas por alunos: ");
        int qtdNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        double total = 0; // Total das notas de cada aluno
        for (int a = 0; a < notasDaTurma.length; a++){//a = quantidade de alunos
            for(int n = 0; n < notasDaTurma[a].length; n++){//n = valor de notas dos alunos
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = entrada.nextDouble();
                total += notasDaTurma[a][n];
            }
        }
        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Media da turma é " + media);

        for(double[] notasDoAluno : notasDaTurma){//Mostar as notas em fomato de matriz
            System.out.println(Arrays.toString(notasDoAluno));
        }

        entrada.close();
    }
}
