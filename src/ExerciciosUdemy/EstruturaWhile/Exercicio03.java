// Enunciado:
// Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.

package ExerciciosUdemy.EstruturaWhile;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Entrada de dados

        // Variaveis
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int codigo = 0;

        // Mandando a mensagem na tela para o usuario e armazenando na variavel codigo
        System.out.println("Digite o codigo do combustivel: ");
        System.out.println("1 - Alcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("4 - Fim");
        codigo = sc.nextInt();

        // Enquanto o codigo for diferente de 4, o programa vai continuar rodando
        while (codigo != 4) {

            // Para esse tipo de exercicio, o switch é mais indicado
            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    break;
            }
            // Ou também podemos fazer utilizando if e else if
            // if (codigo == 1) {
            // alcool++;
            // } else if (codigo == 2) {
            // gasolina++;
            // } else if (codigo == 3) {
            // diesel++;
            // }

            // Mandando a mensagem na tela para o usuario e armazenando na variavel codigo
            System.out.println("Digite o codigo do combustivel: ");
            System.out.println("1 - Alcool");
            System.out.println("2 - Gasolina");
            System.out.println("3 - Diesel");
            System.out.println("4 - Fim");
            codigo = sc.nextInt();
        }
        // Mandando a mensagem na tela para o usuario mostrando os resultados
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel " + diesel);

        sc.close(); // Fechando o Scanner

    }
}
