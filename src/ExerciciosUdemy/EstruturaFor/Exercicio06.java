// Enunciado:
// Ler um número inteiro N e calcular todos os seus divisores.

package ExerciciosUdemy.EstruturaFor;

import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner para ler os dados

        int numero; // Variavel para armazenar o número digitado pelo úsuario

        System.out.println("Digite um número: "); // Pedindo para o úsuario digitar um número
        numero = sc.nextInt(); // Armazenando o número digitado na variavel

        for (int i = 1; i <= numero; i++) { // Loop para deixar que o úsuario digite o número de que digitou anteriormente

            if (numero % i == 0) { // Verificando se o número é divisivel por i
                System.out.println("Divisores: " + i); // Exibindo o número
            }
        }
        sc.close(); // Fechando o objeto Scanner
    }
}
