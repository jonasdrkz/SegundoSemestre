package aula_29_08;

import javax.swing.JOptionPane;

public class MetodoReplace {

    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Informe uma frase: ");

        //trocando caracteres        
        JOptionPane.showMessageDialog(null, "Trocando os caracteres da palavra: \n"
                + frase + "o 'a' por 'u'\n" + frase.replace("a", "u"));

        //tirando os espaços vazios
        JOptionPane.showMessageDialog(null, "Tirando os espaços vazios das palavras: \n"
                + frase + "\n" + frase.replace(" ", ""));

        //trocando caracteres no vetor
        String[] cores = {"azul", "amarelo", "laranja"};
        
        for (int i = 0; i < 3; i++) {
            JOptionPane.showMessageDialog(null, "Trocando caracteres 'a' por 'u' das palavras no vetor:\n"
                    + cores[i]+ "\n"+ cores[i].replace("a", "u"));
        }
        
        //metodo length 
        int qntd = frase.length();
        JOptionPane.showMessageDialog(null, "Quantidade de espaços da frase: "+ qntd);
    }
}
