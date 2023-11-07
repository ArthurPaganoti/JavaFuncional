// Enunciado:
// 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
//
//de acordo com a tabela abaixo:
//
//Fórmula do IMC = peso / (altura) ²
//
//Tabela Condições IMC
//
//
//
// Abaixo de 18,5   | Abaixo do peso
//
// Entre 18,6 e 24,9 | Peso ideal (parabéns)
//
// Entre 25,0 e 29,9 | Levemente acima do peso
//
// Entre 30,0 e 34,9 | Obesidade grau I
//
// Entre 35,0 e 39,9 | Obesidade grau II (severa)
//
// Maior ou igual a 40 | Obesidade grau III (mórbida)

package ExerciciosInternet;

// Passo a Passo:
// 1 - Importar o Scanner
// 2 - Instanciar o Scanner
// 3 - Importar o Locale
// 4 - Instanciar o Locale
// 5 - Criar as variáveis
// 6 - Pedir os valores para o usuário e armazenar nas variáveis
// 7 - Criar a variável para o cálculo do IMC
// 8 - Criar a condicional para verificar a condição do IMC
// 9 - Imprimir na tela a condição do IMC


import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // 3 - Importar o Locale // 4 - Instanciar o Locale
        Scanner sc = new Scanner(System.in); // 1 - Importar o Scanner // 2 - Instanciar o Scanner

        // 5 - Criar as variáveis
        double altura, peso, calculoIMC;

        // 6 - Pedir os valores para o usuário e armazenar nas variáveis
        System.out.println("Digite a sua altura: ");
        altura = sc.nextDouble();
        System.out.println("Digite o seu peso: ");
        peso = sc.nextDouble();

        // 7 - Criar a variável para o cálculo do IMC
        calculoIMC = peso / (Math.pow(altura, 2));

        // 8 - Criar a condicional para verificar a condição do IMC
        if (calculoIMC <= 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (calculoIMC >= 18.6 & calculoIMC <= 24.9) {
            System.out.println("Peso ideal (Parabéns)");
        } else if (calculoIMC >= 25 & calculoIMC <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (calculoIMC >= 30.0 & calculoIMC <= 34.9) {
            System.out.println("Obesidade de Grau |");
        } else if (calculoIMC >= 35 & calculoIMC <= 39.9) {
            System.out.println("Obesidade grau ||");
        } else {
            System.out.println("Obesidade grau ||| (mórbida)");
        }
        sc.close(); // Fechando o Scanner
    }
}
