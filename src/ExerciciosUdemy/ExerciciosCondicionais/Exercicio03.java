// Enunciado:
// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

package ExerciciosUdemy.ExerciciosCondicionais;

// Passo a Passo:
// 1. Declarar as variáveis do tipo inteiro
// 2. Ler os valores
// 3. Verificar se os valores são multiplos
// 4. Imprimir o resultado

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        // Ou podemos fazer utilizando variaveis de maior e menor.

        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner para ler os valores

        // Variaveis
        int numeroUm, numeroDois;

        // Pedindo para o úsuario digitar os números e armazenando
        System.out.println("Digite o primeiro valor: ");
        numeroUm = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        numeroDois = sc.nextInt();

        if (numeroUm % numeroDois == 0 | numeroDois % numeroUm == 0) { // Se número divido por número 2 tiver o resto da divisão = 0
            // ou se número 2 dividido por numero 1 tiver o resto da divisão igual a 0
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        sc.close(); // Fechando o objeto Scanner
    }
}