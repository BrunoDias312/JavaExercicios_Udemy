package fundamentos.operadores;

public class DesafioLogicos {
    //Trabalho na Terça (V ou F)
    //Trabalho na quinta(V ou F)

    public static void main(String[] args) {

        boolean trabalho1 = false; // tv 32 polegadas
        boolean trabalho2 = true; // tv 42 polegadas

        if(trabalho1 && trabalho2){
            System.out.println("Comprei uma TV de 50P e tomamos sorvete.");
        }
        if(trabalho1 || trabalho2) {
            System.out.println("comprei a tv de 32P e tomamos sorvete.");
        }
        if(!trabalho1 && !trabalho2){
            System.out.println("Não consegui trabalho, entao nao comprei TV nem fomos ao Shopping...");
            System.out.println("Parabens, voce e sua familia estaram mais saudaveis no futuro...!");
        }
    }

}
