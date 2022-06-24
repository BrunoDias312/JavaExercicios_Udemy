package classe.DesafioModulo;

public class Jantar{
    public static void main(String[] args) {
        Comida C1 = new Comida("Macarrao", 0.200);
        Pessoa P1 = new Pessoa("Joao", 62);

        System.out.printf("Nome: %s\nPeso: %2f.\n",P1.nomePessoa, P1.pesoPessoa);

        P1.Comer(C1);

        System.out.println("\n--> Depois de comer -->\n");
        System.out.printf("Nome: %s\nPeso: %f.", P1.nomePessoa, P1.pesoPessoa);

    }
}
