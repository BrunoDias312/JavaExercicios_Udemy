package Array_and_Collections.Arrays.Desafio;

import java.util.Scanner;

public class Array {

    int quantidadeNotas;
    Array(int quantidadeNotas){
        this.quantidadeNotas = quantidadeNotas;
    }

    public static void main(String[] args) {

        System.out.println("Notas Academicas");
        Scanner entrada = new Scanner(System.in);//entrada para o user

        System.out.print("Quantidade de notas: ");
        int quantidadeNotas = entrada.nextInt();//Quantidade de notas a ser inserida
        Array p = new Array(quantidadeNotas);

        double[] notasAlunos = new double[quantidadeNotas];//colocar no array a quantidade de notas a ser inseridas

        for(int i = 0; i < notasAlunos.length; i++){//verificar quantidade de notas a ser inseridas
            System.out.print("Digite a nota: ");
            double nota = entrada.nextDouble();

            notasAlunos[i] = nota;//Colocar as notas no array
        }

        for (double notasAluno : notasAlunos) {//Mostrar as notas do aluno
            System.out.println(notasAluno);
        }

    }

}
