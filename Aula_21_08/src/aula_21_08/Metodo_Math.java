package aula_21_08;

import java.lang.Math;

import javax.swing.JOptionPane;

public class Metodo_Math {

    public static void main(String[] args) {
        int x, y;

        x = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de x:"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de y:"));

        //Metodo para saber o maior numero entre x e y Math.max(x, y)
        JOptionPane.showMessageDialog(null, "O maior numero entre x: " + x + " e y: " + y + " é: " + Math.max(x, y));

        //Metodo para saber o menor numero entre x e y Math.min(x, y)
        JOptionPane.showMessageDialog(null, "O menor numero entre x: " + x + " e y: " + y + " é: " + Math.min(x, y));

        //Metodo para saber a raiz quadrada de um numero Math.sqrt(num) 
        JOptionPane.showMessageDialog(null, "A raiz quadrada de x é: " + Math.sqrt(x)
                + "\nA raiz quadrada de y é: " + Math.sqrt(y));

        //Metodo para fazer um numero ao quadrado Math.pow(num, 2)
        JOptionPane.showMessageDialog(null, "X ao cubo: " + Math.pow(x, 3)
                + "\nY ao quadrado: " + Math.pow(y, 2));

        //Metodo para gerar um numero aleatorio de 0 a 100
        JOptionPane.showMessageDialog(null, "Um numero aleatorio de 0 a 100: " + Math.random() * 11);
    }

}
