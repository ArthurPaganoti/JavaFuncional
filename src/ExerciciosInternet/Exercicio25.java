package ExerciciosInternet;

// Faça um programa que
// pergunte o preço de três produtos e informe qual produto você deve comprar,
// sabendo que a decisão é sempre o mais barato.

// Vamos precisar do Scanner para armazenar os valores digitados nas váriaveis.
// Vamos precisar de 3 váriaveis para os produtos. (produtoUm, produtoDois, produtoTres).
// Vamos mandar três mensagens pedindo para o úsuario informar o valor de cada um dos produtos.
// Vamos armazenar cada um dos valores digitados nas suas devidas váriaveis.
// Vamos para as verificações:
// IF: Se o produtoUm for mais barato que o produtoDois e mais barato que o produtoTres, vamos mandar a mensagem informando que ele é o mais barato.
// ELSE IF: Se não se o produtoDois for mais barato que o produtoUm e mais barato que o produtoTres, vamos mandar uma mensagem informando que ele é o mais barato.
// ELSE: Se não, o produto três é o mais barato.

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double produtoUm, produtoDois, produtoTres;

        System.out.println("Informe o valor do primeiro produto: ");
        produtoUm = sc.nextDouble();

        System.out.println("Informe o valor do segundo produto: ");
        produtoDois = sc.nextDouble();

        System.out.println("Informe o valor do terceiro produto: ");
        produtoTres = sc.nextDouble();

        if (produtoUm < produtoDois && produtoUm < produtoTres) {
            System.out.println("Recomendado comprar o produto um!");
        } else if (produtoDois < produtoUm && produtoDois < produtoTres) {
            System.out.println("Recomendo comprar o produto dois!");
        } else {
            System.out.println("Recomendo comprar o produto três!");
        }

        sc.close();
    }
}
