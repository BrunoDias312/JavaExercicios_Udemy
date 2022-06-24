package Array_and_Collections.Arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notaAlunoA = new double[4];
        notaAlunoA[0] = 7.9;
        notaAlunoA[1] = 8;
        notaAlunoA[2] = 6.7;
        notaAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notaAlunoA));

        double totalAlunoA = 0;
        for (double v : notaAlunoA) { //length é para medir o tamanho do Array
            totalAlunoA += v;
        }
        System.out.println(totalAlunoA / notaAlunoA.length);

        //outra forma de inicializar o array
        double[] notaAlunoB = {6.9, 8.9, 5.5, 10};

        double totalAlunoB = 0;
        for (double v : notaAlunoB) {
            totalAlunoB += v;
        }
        System.out.println(totalAlunoB / notaAlunoB.length);
    }
}
