import java.util.Scanner;

public class testaProdutos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\n***Registrador de Compras***\n" +
                "\nInforme a quantidade de produtos deseja registrar:\t");
        int qntProdutos = scan.nextInt();
        scan.nextLine();

        Produto[] qntComprados = new Produto[qntProdutos];

        for (int i = 0; i < qntComprados.length; i++) {
            System.out.print("\nInforme o nome do produto:\t");
            String nomeProduto = scan.nextLine();

            System.out.print("Informe o valor do produto:\t");
            double valorProduto = scan.nextDouble();

            System.out.print("Informe a quantidade de produtos:\t");
            int quantidadeProduto = scan.nextInt();
            scan.nextLine();

            qntComprados[i] = new Produto(nomeProduto, valorProduto, quantidadeProduto);
        }

        System.out.println("\n***Status de Compra***");
        for (Produto produto : qntComprados) {
            System.out.println("\nNome do produto: " + produto.getNome());
            System.out.println("Valor: R$ " + produto.getValor());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("Total da compra com impostos: R$ " + produto.calculaValorTotal());
        }

    }

}
