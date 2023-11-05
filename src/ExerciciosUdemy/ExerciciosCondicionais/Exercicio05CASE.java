// É o mesma resolução do exercicio 05, porém nessa resolução vai ser utilizado o uso da estrutura case.

package ExerciciosUdemy.ExerciciosCondicionais;

import java.util.Scanner;


public class Exercicio05CASE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigoItem, quantidadeItem;
        double totalCompra;

        System.out.println("Digite o código do item: ");
        System.out.println("1 - Cachorro-quente");
        System.out.println("2 - X-Salada");
        System.out.println("3 - X-Bacon");
        System.out.println("4 - Torrada-simples");
        System.out.println("5 - Refrigerante");
        codigoItem = sc.nextInt();

        switch (codigoItem) {

            case 1:
                System.out.println("Digite a quantidade do item: ");
                quantidadeItem = sc.nextInt();
                totalCompra = quantidadeItem * 4.00;
                System.out.println("Total a pagar: R$ " + totalCompra);
                break;

            case 2:
                System.out.println("Digite a quantidade do item: ");
                quantidadeItem = sc.nextInt();
                totalCompra = quantidadeItem * 4.50;
                System.out.println("Total a pagar: R$ " + totalCompra);
                break;

            case 3:
                System.out.println("Digite a quantidade do item: ");
                quantidadeItem = sc.nextInt();
                totalCompra = quantidadeItem * 5.00;
                System.out.println("Total a pagar: R$ " + totalCompra);
                break;

            case 4:
                System.out.println("Digite a quantidade do item: ");
                quantidadeItem = sc.nextInt();
                totalCompra = quantidadeItem * 2.00;
                System.out.println("Total a pagar: R$ " + totalCompra);
                break;

            case 5:
                System.out.println("Digite a quantidade do item: ");
                quantidadeItem = sc.nextInt();
                totalCompra = quantidadeItem * 1.50;
                System.out.println("Total a pagar: R$ " + totalCompra);
                break;

            default:
                System.out.println("Código inválido!");
                break;
        }
        sc.close();
    }
}