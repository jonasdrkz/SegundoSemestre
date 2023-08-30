package aula_29_08;

import javax.swing.JOptionPane;

public class Metodostarts_endsWith {

    public static void main(String[] args) {

        String string1 = "Hello word";

        System.out.println(string1.startsWith("\nHello"));
        System.out.println(string1.endsWith("word"));

        //___________________________________________
        String[] nome = {"maria", "Jose"};

        System.out.println("\nnome: "+nome[0].startsWith("m"));
        System.out.println("nome: "+nome[1].endsWith("se"));
        
        //___________________________________________
        
        String nomeTeste;
        
        nomeTeste = JOptionPane.showInputDialog("Informe seu nome: ").toUpperCase();
        
        if(nomeTeste.startsWith("J")){
            System.out.println("\nSeu nome começa com J");
        }else{
            System.out.println("\nSeu nome não começa com J");
        }
    }
}