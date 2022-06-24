package classe.DesafioModulo;

public class Pessoa {
    String nomePessoa;
    double pesoPessoa;

    Pessoa(String nomePessoa, double pesoPessoa){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }

    void Comer(Comida comida){
        if(comida != null){
            this.pesoPessoa += comida.pesoComida;
        }

    }
}
