// Enunciado:
//  Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

package ExerciciosInternet;

// Passo a Passo:
// 1 - Importar o Scanner
// 2 - Instanciar o Scanner
// 3 - Criar as variáveis
// 4 - Pedir os valores para o usuário e armazenar nas variáveis
// 5 - Criar a condicional para verificar se os valores são verdadeiros ou falsos

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 1 - Importar o Scanner // 2 - Instanciar o Scanner

        // 3 - Criar as variáveis
        boolean valorA, valorB;

        // 4 - Pedir os valores para o usuário e armazenar nas variáveis
        System.out.println("Digite o valor de A: ");
        valorA = sc.nextBoolean();
        System.out.println("Digite o valor de B: ");
        valorB = sc.nextBoolean();

        // 5 - Criar a condicional para verificar se os valores são verdadeiros ou falsos
        if (valorA == true && valorB == true) {
            System.out.println("Ambos são verdadeiros");
        } else if (valorA == false && valorB == false) {
            System.out.println("Ambos são falsos");
        } else {
            System.out.println("Um é verdadeiro e o outro é falso");
        }
        sc.close(); // Fechando o Scanner
    }
}
