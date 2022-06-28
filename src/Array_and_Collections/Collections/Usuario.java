package Array_and_Collections.Collections;

public class Usuario {
    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {
        Usuario outro = (Usuario) objeto;

        if(objeto instanceof Usuario){
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }else
            return false;
    }

    //Apenas para saber como fazer
    @Override
    public int hashCode() {
        return this.nome.length();
    }
}
//Tambem tem como pedir para a IDEA gerar o Equals e o HashCode