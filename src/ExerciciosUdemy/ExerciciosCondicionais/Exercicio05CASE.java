// É o mesma resolução do exercicio 05, porém nessa resolução vai ser utilizado o uso da estrutura case.

package ExerciciosUdemy.ExerciciosCondicionais;

import java.util.Scanner;

// Vou terminar
public class Exercicio05CASE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigoItem, quantidadeItem;
        double totalCompra;

        System.out.println("Digite o código do item: ");
        codigoItem = sc.nextInt();

        switch (codigoItem) {

            case 1:
                System.out.println("Digite a quantidade do item: ");
                quantidadeItem = sc.nextInt();
                totalCompra = quantidadeItem * 4.00;

        }
    }
}
