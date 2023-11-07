/*
 * DIEGO PARAGUAI DE CARVALHO
 * ADS 01 NOTURNO - CARAPICUIBA
*/

/*
Exercio 01:
Ler a idade de uma pessoa expressa em anos, meses e dias e mostrá-la expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. (Exemplo: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */ 

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.print("ola! eu vou adivinhar quantos dias de idade voce tem :D\nDigite quantos anos voce tem:  ");
        Scanner scan = new Scanner(System.in);
        int ano, mes, diaAniver, hoje, dias, diasTotal; 
        ano =scan.nextInt();
        System.out.print("maravilha! agora digite quantos meses passou desde o seu ultimo aniversario:  ");
        mes = scan.nextInt();
        System.out.print("estamos acabando, agora digite o numero dia do seu aniversario:  ");
        diaAniver = scan.nextInt();
        System.out.print("e para finalizar, digite que numero do dia é hoje: ");
        hoje = scan.nextInt();

        if (diaAniver > hoje) {
            hoje += 30;
        }

        dias = hoje - diaAniver;

        diasTotal = dias + mes*30 + ano*365;

        System.out.println("baseado nessas informacoes, voce tem "+ diasTotal +" dias de idade!!!");

        scan.close();

    }
}

// ----------------------------------------------------------------
