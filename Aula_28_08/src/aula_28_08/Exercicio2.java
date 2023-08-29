package aula_28_08;

import javax.swing.JOptionPane;

//Exercicio 2 da aula do dia 21

public class Exercicio2 {

    public static void main(String[] args) {

        int num, maiorNum = Integer.MIN_VALUE, menorNum = Integer.MAX_VALUE;
        String op = "S";

        do {

            num = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));

            if (num > maiorNum) {
                System.out.println("Agora " + num + " é o maior numero");

            } else if (num < menorNum) {
                System.out.println("Agora " + num + " é o menor numero");
            }

            menorNum = Math.min(num, menorNum);
            maiorNum = Math.max(num, maiorNum);

            op = JOptionPane.showInputDialog("Deseja continuar?(S/N)").toUpperCase();

        } while (op.equals("S"));

        JOptionPane.showMessageDialog(null, "O menor numero informado foi: " + maiorNum
                + "O menor numero informado foi: " + menorNum);
    }
}
