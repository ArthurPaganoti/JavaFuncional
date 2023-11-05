// Enunciado:
// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar

package ExerciciosUdemy.ExerciciosCondicionais;

// Passo a Passo:
// 1. Declarar as variáveis do tipo inteiro
// 2. Ler os valores
// 3. Verificar se os valores são multiplos
// 4. Imprimir o resultado

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner para ler os valores

        // Variáveis
        int codigoItem, quantidadeItem;
        double total;

        // Menu de opções
        // Pede pro úsuario digitar o valor e armazena na variável
        System.out.println("Digite o código do item: ");
        System.out.println("1 - Cachorro-quente");
        System.out.println("2 - X-Salada");
        System.out.println("3 - X-Bacon");
        System.out.println("4 - Torrada-simples");
        System.out.println("5 - Refrigerante");
        codigoItem = sc.nextInt();

        // Verificando o código do item e calculando o total
        if (codigoItem == 1) {
            System.out.println("Digite a quantidade de cachorros-quentes: ");
            quantidadeItem = sc.nextInt();
            total = quantidadeItem * 4.00;
        } else if (codigoItem == 2) {
            System.out.println("Digite a quantidade de X-Salada: ");
            quantidadeItem = sc.nextInt();
            total = quantidadeItem * 4.50;
        } else if(codigoItem == 3) {
            System.out.println("Digite a quantidade de X-Bacon: ");
            quantidadeItem = sc.nextInt();
            total = quantidadeItem * 5.00;
        } else if(codigoItem == 4) {
            System.out.println("Digite a quantidade de torrada-simples: ");
            quantidadeItem = sc.nextInt();
            total = quantidadeItem * 2.00;
        } else {
            System.out.println("Digite a quantidade de refrigerante: ");
            quantidadeItem = sc.nextInt();
            total = quantidadeItem * 1.50;
        }
        // Imprimindo o total
        System.out.println("Total a pagar: R$ " + total);
        sc.close(); // Fechando o objeto scanner.
    }
}