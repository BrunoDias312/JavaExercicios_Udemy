package classe.AreaCirc;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(10);
        a1.raio = 10;
        //a1.pi = 10;

        AreaCirc a2 = new AreaCirc(5);
        a2.raio = 100;
        //a2.pi = 5;

        //AreaCirc.pi = 3.1415;  //Nao ira funcionar por que esta com "final" declarado na variavel

        System.out.println(a2.area());

        System.out.println(a2.area());
        System.out.println(AreaCirc.pi);
        System.out.println(Math.PI);
    }
}
