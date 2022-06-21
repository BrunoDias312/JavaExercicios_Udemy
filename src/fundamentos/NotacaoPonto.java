package fundamentos;

import java.util.Locale;

public class NotacaoPonto {
    public static void main(String[] args) {
        double a = 1.3;
        String s = "Bom dia, Sr.";
        s = s.replace("Sr.", "Midas."); //Substitui Sr por Midas Replace faz substituição
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String y = "Bom dia gaucho".replace("gaucho", "Sz").toUpperCase().concat(" !!!!");
        System.out.println(y);


    }
}
