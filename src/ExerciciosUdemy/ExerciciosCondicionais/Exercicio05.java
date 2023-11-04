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

//OBS: Vou terminar de comentar

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner para ler os valores

        int codigoItem, quantidadeItem;
        double total;

        System.out.println("Digite o código do item: ");
        codigoItem = sc.nextInt();

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
        System.out.println("Total a pagar: R$ " + total);
        sc.close();
    }
}