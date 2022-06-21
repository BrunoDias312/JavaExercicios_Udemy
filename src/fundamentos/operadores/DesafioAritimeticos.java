package fundamentos.operadores;

public class DesafioAritimeticos {
    public static void main(String[] args) {

        /*int a = 2 + 3 - 10;
        int b = (int) Math.pow(a,3); //estou fazendo em cache
        double c = Math.pow(a,3); //Não estou colocando em cache
        */

        //Primeira parte
        int a = 6 * (3 + 2); int b = (int) Math.pow(a,2); int c = b / (3*2);
        System.out.println(c);

        //Segunda parte
        int A = (1 - 5) * (2 - 7) / 2; int B = (int) Math.pow(A, 2);
        System.out.println(B);

        //Terceira Parte
        int x = c - B; int y = (int) Math.pow(x, 3);
        System.out.println(y);

        //Parte final
        int resultado = y / (int) Math.pow(10,3);
        System.out.println(resultado);

    }
}
