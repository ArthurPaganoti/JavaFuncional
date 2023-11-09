// Enunciado:
// Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
//
// pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
//
//
//
// Tabela de Código de Condições de Pagamento
//
//
//
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
//
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
//
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
//
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

package ExerciciosInternet;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Para usar o ponto ao invés da vírgula na hora de digitar os números
        Scanner sc = new Scanner(System.in); // Para ler o que o usuário digitar

        // Variáveis
        int formaPagamento;
        double valorCompra;

        // Pedindo para digitar a forma de pagamento e armazenando na variável
        System.out.println("Escolha a forma de pagamento: ");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        formaPagamento = sc.nextInt();

        // Verificando a forma de pagamento e calculando o valor final da compra
        // Para esse exemplo, o if e else if é mais indicado, mas também podemos utilizar o switch

        switch (formaPagamento) {
            case 1:
                System.out.println("Digite o valor da compra: ");
                valorCompra = sc.nextDouble();
                System.out.println("O valor final da compra é: " + (valorCompra - (valorCompra * 0.15)));
                break;
            case 2:
                System.out.println("Digite o valor da compra: ");
                valorCompra = sc.nextDouble();
                System.out.println("O valor final da compra é: " + (valorCompra - (valorCompra * 0.10)));
                break;
            case 3:
                System.out.println("Digite o valor da compra: ");
                valorCompra = sc.nextDouble();
                System.out.println("O valor final da compra é: " + valorCompra);
                break;
            case 4:
                System.out.println("Digite o valor do produto: ");
                valorCompra = sc.nextDouble();
                System.out.println("O valor da compra é: " + (valorCompra + (valorCompra * 0.10)));
                break;
            default:
                System.out.println("Forma de pagamento não encontrada");
                break;
        }

        // Ou podemos fazer utilizando if e else if
        // if (formaPagamento == 1) {
        //     System.out.println("Digite o valor da compra: ");
        //     valorCompra = sc.nextDouble();
        //     System.out.println("O valor final da compra é: " + (valorCompra - (valorCompra * 0.15)));
        // } else if (formaPagamento == 2) {
        //     System.out.println("Digite o valor da compra: ");
        //     valorCompra = sc.nextDouble();
        //     System.out.println("O valor final da compra é: " + (valorCompra - (valorCompra * 0.10)));
        // } else if (formaPagamento == 3) {
        //     System.out.println("Digite o valor da compra: ");
        //     valorCompra = sc.nextDouble();
        //     System.out.println("O valor final da compra é: " + valorCompra);
        // } else if (formaPagamento == 4) {
        //     System.out.println("Digite o valor do produto: ");
        //     valorCompra = sc.nextDouble();
        //     System.out.println("O valor da compra é: " + (valorCompra + (valorCompra * 0.10)));
        // } else {
        //     System.out.println("Forma de pagamento não encontrada");
        // }
        sc.close(); // Fechando o Scanner
    }
}
