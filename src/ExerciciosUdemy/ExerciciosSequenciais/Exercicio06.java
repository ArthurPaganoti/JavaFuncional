// Enunciado:
// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

package ExerciciosUdemy.ExerciciosSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Para o programa aceitar o ponto ao invés da vírgula
        Scanner sc = new Scanner(System.in); // Para ler os valores

        // Declarando as variáveis
        double valorA, valorB, valorC;
        double resultadoAreaTrianguloRetangulo;
        double resultadoAreaCirculo;
        double resultadoAreaTrapezio;
        double resultadoAreaQuadrado;
        double resultadoAreaRetangulo;

        // Lendo os valores
        System.out.println("Digite o valor de A: ");
        valorA = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        valorB = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        valorC = sc.nextDouble();

        //  Calculando as áreas
        resultadoAreaTrianguloRetangulo = (valorA * valorC) / 2;
        resultadoAreaCirculo = 3.14159 * (Math.pow(valorC, 2));
        resultadoAreaTrapezio = (valorA + valorB) * valorC / 2;
        resultadoAreaQuadrado = Math.pow(valorB, 2);
        resultadoAreaRetangulo = valorA * valorB;

        // Mostrando os resultados
        System.out.println("A área do triângulo retângulo é: " + resultadoAreaTrianguloRetangulo);
        System.out.println("A área do circulo é: " + resultadoAreaCirculo);
        System.out.println("A área do trápezio é: " + resultadoAreaTrapezio);
        System.out.println("A área do quadrado é: " + resultadoAreaQuadrado);
        System.out.println("A área do retângulo é: " + resultadoAreaRetangulo);

        sc.close(); // Fechando o objeto sc
    }
}