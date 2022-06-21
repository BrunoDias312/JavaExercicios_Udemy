package classe.Data;

import javax.crypto.spec.PSource;

public class DataTeste {
    public static void main(String[] args) {
        Data p1 = new Data();
        /*p1.dia = 01;
        p1.mes = 07;
        p1.ano = 2022;*/

        var p2 = new Data(10,7,2000);
        /*p2.dia = 05;
        p2.mes = 10;
        p2.ano = 2022;*/

        String dataFormatada1 = p1.obterDataFormatada();

        System.out.println(dataFormatada1);
        System.out.println(p2.obterDataFormatada());

        p1.imprimirDataFormatada();//imprimir na tela sem chamar o sout
        p2.imprimirDataFormatada();

    }
}
