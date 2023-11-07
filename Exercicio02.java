/*
Exercicio 02
Ler a idade de uma pessoa e informar a sua classe eleitoral:
• não eleitor (abaixo de 16 anos);
• eleitor obrigatório (entre a faixa de 18 a 64 anos);
• eleitor facultativo (de 16 até 17 anos e maior de 64 anos)
*/
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.print("parado ai!, primeiro digite a sua idade: ");
        Scanner scan = new Scanner(System.in);
        int idade = scan.nextInt();
        if (idade > 64) {
            System.out.println("voto facultativo");
        } else if (idade > 17) {
            System.out.println("voto obrigatorio");
        } else if (idade > 15) {
            System.out.println("voto facultativo");
        } else {
            System.out.println("nao pode votar");
        }
        scan.close();
    }
}

//----------------------------------------------------------------