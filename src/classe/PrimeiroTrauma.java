package classe;
/*
EXERCICIO
Acessar int a na classe principal sem torna-la static
 */
public class PrimeiroTrauma {
    int a = 3;//Nao altera-la

    public static void main(String[] args) {

        PrimeiroTrauma p = new PrimeiroTrauma();
        System.out.println(p.a);
    }
}
