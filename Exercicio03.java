/*
Exercicio 03
Dados três valores a, b e c (lidos a partir do teclado), imprimir esses valores em ordem ascendente (do menor para o maior). DICA: usar aninhamento, assim o programa fica eficiente
*/
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, aux;
        System.out.print("digite o valor de A: ");
        a = scanner.nextInt();
        System.out.print("digite o valor de B: ");
        b = scanner.nextInt();
        System.out.print("digite o valor de C: ");
        c = scanner.nextInt();

        if (a < b) {
            aux = a;
            a = b;
            b = aux;
        }
        if (a < c) {
            aux = a;
            a = c;
            c = aux;            
        }
        if (b < c) {
            aux = c;
            c = b;
            b = aux;
        }

        System.out.println("ordem crescente:");
        System.out.println("A: " +a);
        System.out.println("B: " +b);
        System.out.println("C: " +c);

        scanner.close();
        
    }
}

//----------------------------------------------------------------
