package fundamentos;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;
import java.lang.String;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Boa tarde,".charAt(0));

        String s = "Bom dia";
        System.out.println(s.concat("!!!"));
        System.out.println(s.concat("!!!l"));
        System.out.println(s.toLowerCase().startsWith("bom"));//coloca tudo em minusculo depois ve se "s" comeca com bom
        System.out.println(s.endsWith("dia"));//verifica se "s" termina com dia
        System.out.println(s.length());
        System.out.println(s.equals("bom dia"));//compara se é igual 's' com o que esta escrito em ()
        System.out.println(s.equalsIgnoreCase("bom dia"));//faz o de cima mas ignora se é maiusculo

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 145.09;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade:" + "\nSalario: " + salario);
        System.out.println("\n OU PODE FAZER ASSIM");

        //System.out.printf("Nome: %s \nSobrenome: %s \nIdade: %d \nSalario: %.2f.", nome, sobrenome, idade, salario);
        //System.out.printf("o senhor %s %s tem %d anos e ganha %.2f", nome, sobrenome, idade, salario);



    }
}
