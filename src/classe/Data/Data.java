package classe.Data;

public class Data {

    //Tornei public as variaveis para que outras classes de outros pacotes possam acessá-la
    //O mesmo para os construtores e metodos
    public int dia;
    public int mes;
    public int ano;

    public Data(){
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        this(1,1,1970); // Este metodo This(), somente pode ser usado dentro de outro construtor para referenciar outro construtor
    }
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String obterDataFormatada(){
        final String formato = "%d/%d/%d.";
        return String.format(formato, dia, mes, ano);
    }

    void imprimirDataFormatada(){System.out.println(obterDataFormatada());}


}
