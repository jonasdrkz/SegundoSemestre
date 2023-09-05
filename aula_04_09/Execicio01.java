package aula_04_09;

import javax.swing.JOptionPane;

public class Execicio01 {

    static int qntdEscolhida;
    static int numeros[] = new int[99];
    static int menuOpcoes;

    public static void main(String[] args) {
        carregar();
        menu();
    }

    public static void menu() {

        do {
            menuOpcoes = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção:\n"
                    + "1 - Exibir lista\n"
                    + "2 - Exibir impares\n"
                    + "3 - Exibir pares\n"
                    + "4 - Exibir impares em posições pares\n"
                    + "5 - Exibir pares em posições impares\n"
                    + "0 - Encerrar", "Menu", JOptionPane.INFORMATION_MESSAGE));

            String escolhaOpcao = Integer.toString(menuOpcoes);

            switch (escolhaOpcao) {
                case "1" -> {
                    exibirLista();
                }
                case "2" -> {
                    exibirImpares();
                }
                case "3" -> {
                    exibirPares();
                }
                case "4" -> {
                    quantidadeImparesNosPares();
                }
                case "5" -> {
                    quantidadeParesNosImpares();
                }
                case "0" -> {
                    JOptionPane.showMessageDialog(null, "Programa encerrado com sucesso!");
                }
                default ->
                    JOptionPane.showMessageDialog(null, "opção invalida");
            }
        } while (menuOpcoes != 0);

    }

    public static void carregar() {
        int cont = 0;

        qntdEscolhida = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros deseja informar?"));

        do {
            numeros[cont] = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero [" + cont + "]:"));

            cont++;
        } while (cont < qntdEscolhida);
    }

    public static void exibirLista() {
        String lista = "";

        for (int i = 0; i < qntdEscolhida; i++) {
            lista += "[" + i + "] - " + numeros[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, "Lista:\n" + lista);
    }

    public static void exibirImpares() {
        String lista = "";

        for (int i = 0; i < qntdEscolhida; i++) {
            if (numeros[i] % 2 != 0) {
                lista += "[" + i + "] - " + numeros[i] + "\n";
            }
        }
       
        if(!lista.equals("")){
            JOptionPane.showMessageDialog(null, "Lista dos numeros impares:\n" + lista);            
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum numero impar");
        }
    }

    public static void exibirPares() {
        String lista = "";

        for (int i = 0; i < qntdEscolhida; i++) {
            if (numeros[i] % 2 == 0) {
                lista += "[" + i + "] - " + numeros[i] + "\n";
            }
        }
        
        if(!lista.equals("")){
            JOptionPane.showMessageDialog(null, "Lista dos numeros pares:\n" + lista);            
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum numero par");
        }

    }

    public static void quantidadeImparesNosPares() {
        String lista = "";

        for (int i = 0; i < qntdEscolhida; i++) {
            if (i % 2 == 0 && numeros[i] % 2 != 0) {
                lista += "[" + i + "] - " + numeros[i] + "\n";
            }
        }
        
        if(!lista.equals("")){
            JOptionPane.showMessageDialog(null, "Lista dos numeros impares em posições pares:\n" + lista);            
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum numero impar em uma posição par");
        }
    }

    public static void quantidadeParesNosImpares() {
        String lista = "";

        for (int i = 0; i < qntdEscolhida; i++) {
            if (i % 2 != 0 && numeros[i] % 2 == 0) {
                lista += "[" + i + "] - " + numeros[i] + "\n";
            }
        }
        
        if(!lista.equals("")){
            JOptionPane.showMessageDialog(null, "Lista dos numeros pares em posições impares:\n" + lista);            
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum numero par em posição impar");
        }

    }
}
