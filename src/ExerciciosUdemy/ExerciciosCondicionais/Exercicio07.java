// Enunciado:
// Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.

package ExerciciosUdemy.ExerciciosCondicionais;

// Passo a Passo:
// 1. Declarar as variáveis do tipo double
// 2. Ler os valores
// 3. Verificar se os valores são multiplos
// 4. Imprimir o resultado

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Definindo o local como US para usar o ponto ao invés da vírgula
        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner para ler os valores

        double eixoX, eixoY; // Variáveis

        // Pede pro úsuario digitar o valor e armazena na variável
        System.out.println("Digite o valor do eixo X: ");
        eixoX = sc.nextDouble();
        System.out.println("Digite o valor do eixo Y: ");
        eixoY = sc.nextDouble();

        // Verificando se o valor está no intervalo
        if (eixoX > 0 & eixoY > 0) {
            System.out.println("Primeiro Quadrante");
        } else if (eixoX < 0 & eixoY > 0) {
            System.out.println("Segundo Quadrante");
        } else if (eixoX < 0 & eixoY < 0) {
            System.out.println("Terceiro Quadrante");
        } else if (eixoX > 0 & eixoY < 0) {
            System.out.println("Quarto Quadrante");
        } else {
            System.out.println("Origem");
        }
        sc.close(); // Fechando o objeto scanner.
    }
}
