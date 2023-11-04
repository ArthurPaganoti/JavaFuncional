// Enunciado:
// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

package ExerciciosUdemy.ExerciciosCondicionais;

// Passo a Passo:
// 1. Declarar as variáveis do tipo inteiro
// 2. Ler os valores
// 3. Verificar se os valores são multiplos
// 4. Imprimir o resultado

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner para ler os valores

        int horaInicial, horaFinal, duracao;

        System.out.println("Digite a hora inicial: ");
        horaInicial = sc.nextInt();
        System.out.println("Digite a hora final: ");
        horaFinal = sc.nextInt();

        if (horaFinal < horaInicial) { // Se a hora final for menor que a hora inicial
            duracao = horaInicial - horaFinal; // A duração vai ser a hora inicial menos a hora final
        } else { // Se não
            duracao = 24 - horaInicial + horaFinal; // A duração vai ser 24 menos a hora inicial mais a hora final
        }
        sc.close(); // Fechando o objeto Scanner
    }
}
