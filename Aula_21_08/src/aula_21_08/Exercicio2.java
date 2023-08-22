package aula_21_08;

import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {
        int num, maiorNum = Integer.MIN_VALUE, menorNum = Integer.MAX_VALUE;

        do {

            num = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero (Digite 0 para encerrar o programa): "));

            if (num != 0) {
                maiorNum = Math.max(num, maiorNum);
                menorNum = Math.min(num, menorNum);

                if (maiorNum == num) {
                    maiorNum = num;
                    System.out.println("O maior numero agora é = " + maiorNum + "\n");
                } else if (num == menorNum) {
                    menorNum = num;
                    System.out.println("O menor numero agora é = " + menorNum + "\n");
                }

            } else {
                System.out.println("\n------------------");
                System.out.println("Sistema encerrado!");
            }

        } while (num != 0);
    }
}
