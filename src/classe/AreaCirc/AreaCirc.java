package classe.AreaCirc;

public class AreaCirc {
    double raio;
    static final double pi = 3.14; //Tornando o valor de pi, uma variavel de classe ao invez de ser da instância

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }
    double area(){
        return pi * Math.pow(raio, 2); //fazer que seja PI * Raio^2
    }
}
