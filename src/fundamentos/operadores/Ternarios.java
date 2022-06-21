package fundamentos.operadores;

public class Ternarios {
    public static void main(String[] args) {
        double media = 3.6;

        //String resultadoParcial =;
        String resultadoFinal = media >= 7.0 ? "Aprovado" :
                media >= 5.0 ? "Em recuperacao." : "Reprovado.";

        System.out.println("O aluno está " + resultadoFinal);
    }
}
