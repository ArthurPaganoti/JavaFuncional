// Enunciado:
// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

package ExerciciosUdemy.ExerciciosCondicionais;

// Passo a Passo:
// 1. Declarar a variável do tipo inteiro
// 2. Ler o número inteiro
// 3. Verificar se o número é negativo
// 4. Imprimir o resultado

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("O número: " + numero + " é negativo");
        } else {
            System.out.println("O número : " +numero + " é postivo");
        }
        sc.close();
    }
}