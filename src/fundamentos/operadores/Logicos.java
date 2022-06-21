package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {
         boolean condicao1 = true;
         boolean concicao2 = 3 > 7;

        System.out.println(condicao1 && concicao2);
        System.out.println(condicao1 || concicao2);
        System.out.println(condicao1 ^ concicao2); // ou exclusivo
        System.out.println(!condicao1); // not condicao1
        System.out.println(!!concicao2); // not not condicao2


        // Tabela verdade E
        System.out.println("\nTabela verdade E (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false );

        // Tabela verdade OU (OR)
        System.out.println("\nTabela verdade OU (OR)");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // Tabela verdade OU Exclusivo (XOR)
        System.out.println("\nTabela verdade OU Exclusivo (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        // Tabela verdade NOT
        System.out.println("\nTabela verdade NOT");
        System.out.println(!true);
        System.out.println(!false);
    }
}
