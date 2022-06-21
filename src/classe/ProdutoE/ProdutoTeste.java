package classe.ProdutoE;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook",4356.89);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        Produto.desconto = 0.50;

        System.out.println("Produto: " + p1.nome + ", valor é de R$" + p1.preco + ", e o desconto é "
                + 100 * p1.desconto + "%" + ", o preco com desconto é R$" + p1.precoComDesconto() + ".");
        System.out.println("Produto: " + p2.nome + ", valor é de R$" + p2.preco +  ", e o desconto é "
                + 100 * p2.desconto + "%" + ", o preco com desconto é R$" + p2.precoComDesconto() + ".");

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
        System.out.printf("A media entre os produtos é de R$%.2f.", mediaCarrinho);

    }
}
