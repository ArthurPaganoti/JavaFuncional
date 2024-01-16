package ExerciciosInternet;

// Faça um programa que verifique (usando if e else) se uma letra digitada é vogal ou consoante.

// Vamos precisar do Scanner para armazenar a letra digitada pelo úsuario.
// Vamos precisar de uma váriavel (String letra).
// Vamos mandar uma mensagem pedindo para o úsuario digitar alguma letra.
// Vamos armazenar a letra digitada na váriavel utilizando o Scanner.
// Vamos fazer as verificações:
// IF: Se a letra digitada for: a,e,i,o ou u vamos mandar uma mensagem informando que é uma vogal.
// ELSE: Se não, vamos mandar uma mensagem informando que a letra digitada é uma consoante.


import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String letra;

        System.out.println("Digite qualquer letra do alfabeto: ");
        letra = sc.nextLine();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("A letra digitada é uma vogal!");
        } else {
            System.out.println("A letra digitada é uma consoante.");
        }

        sc.close();
    }
}
