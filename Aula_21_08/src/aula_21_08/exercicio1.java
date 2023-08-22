package aula_21_08;

import java.lang.Math;
import javax.swing.JOptionPane;

public class exercicio1 {

    public static void main(String[] args) {

        int num, cont = 0, quadradoSoma = 0;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
            if (num <= 0 || num > 10) {
                JOptionPane.showMessageDialog(null, "Informe um numero maior que zero e menor que 10");
            }
        } while (num <= 0 || num > 10);

        do {

            if (num % 2 != 0) {

                quadradoSoma += Math.pow(num, 2);
                System.out.println(num + " ao quadrado = " + Math.pow(num, 2));

                cont++;
            }
            num++;

        } while (cont < 20);

        System.out.println("\nO resultado do quadrado dos 20 numeros impares é = " + quadradoSoma);
    }

}
