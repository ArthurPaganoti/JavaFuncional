// Enunciado:
// 1. Se você precisa construir um componente usando o Raspberry Pi, provavelmente usará
//resistores. Para este exercício, você precisa saber duas coisas sobre eles:
//• Cada resistor tem um valor de resistência.
//• Os resistores são pequenos - tão pequenos que, se você imprimir o valor da
//resistência neles, seria difícil de ler.
//Para resolver esse problema, os fabricantes imprimem faixas codificadas por cores nos
//resistores para definir seus valores de resistência. Cada faixa tem uma posição e um valor
//numérico.
//As 2 primeiras faixas de um resistor têm um esquema de codificação simples: cada cor é
//mapeada para um número único. Por exemplo, se eles imprimissem uma faixa marrom (valor
//1) seguida por uma faixa verde (valor 5), seria traduzido para o número 15.
//Neste exercício, você criará um programa em Java para não precisar se lembrar dos valores
//das faixas. O programa receberá nomes de cores como entrada e produzirá um número de
//dois dígitos, mesmo que a entrada tenha mais de duas cores! As cores da faixas são
//codificadas da seguinte forma:
//• Preto: 0
//• Marrom: 1
//• Vermelho 2
//• Laranja: 3
//• Amarelo: 4
//• Verde: 5
//• Azul: 6
//• Violeta: 7
//• Cinza: 8
//• Branco: 9
//Do exemplo acima: marrom-verde deve retornar 15 marrom-verde-violeta também deve
//retornar 15, ignorando a terceira cor.

package ExerciciosFaculdade;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Cria o objeto sc para receber dados do usuário

        int valor = 0; // Cria a variável valor e atribui o valor 0

        for (int i = 0; i <= 2; i++) { // Inicialização, condição, incremento

            System.out.println("Digite a cor: "); // Imprime a mensagem
            String cor = sc.nextLine();

            // Verificando a cor e calculando o valor
            switch (cor) {
                case "Preto":
                    valor += 0;
                    break;
                case "Marrom":
                    valor += 1;
                    break;
                case "Vermelho":
                    valor += 2;
                    break;
                case "Laranja":
                    valor += 3;
                    break;
                case "Amarelo":
                    valor += 4;
                    break;
                case "Verde":
                    valor += 5;
                    break;
                case "Azul":
                    valor += 6;
                    break;
                case "Violeta":
                    valor += 7;
                    break;
                case "Cinza":
                    valor += 8;
                    break;
                case "Branco":
                    valor += 9;
                    break;
                default: // Caso a cor não seja encontrada
                    System.out.println("Cor não encontrada");
                    break;
            }
        }
        // Multiplica o valor por 100 para que o primeiro digito seja o valor
        valor *= 100;
        int primeiroDigito = valor / 100; // Divide o valor por 100 para pegar o primeiro digito
        System.out.println("Valor: " + primeiroDigito); // Imprime o primeiro digito

        sc.close(); // Fecha o objeto sc
    }
}
