// Enunciado:
// Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

package ExerciciosInternet;

public class Exercicio19 {
    public static void main(String[] args) {

        // Variaveis
        int numero = 1, resultado;

        // Loop para imprimir a tabuada de 1 até 10
        while (numero <= 10) {
            System.out.println("Tabuada do " + numero);
            for (int i = 1; i <= 10; i++) {
                resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
            numero++;
        }
    }
}
