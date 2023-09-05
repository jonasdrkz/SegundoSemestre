package aula_04_09;

import javax.swing.JOptionPane;

public class CarregarVetor {

    static int qntdEscolhida;
    static int numeros[] = new int[99];

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Object[] opcoesMenu = {"Carregar vetores", "Exibir lista", "Exibir impares", "Exibir pares", "Exibir impares em posições pares", "Exibir pares em posições impares", "Encerrar"};
        Object menu = JOptionPane.showInputDialog(null, "Escolha uma opção:", "Menu", JOptionPane.INFORMATION_MESSAGE, null, opcoesMenu, opcoesMenu[0]);

        String escolhaOpcao = (String) menu;

        switch (escolhaOpcao) {
            case "Carregar vetores" -> {
                carregar();
                menu();
            }
            case "Exibir lista" -> {
                exibirLista();
                menu();
            }
            case "Exibir impares" -> {
                exibirImpares();
                menu();
            }
            case "Exibir pares" -> {
                exibirPares();
                menu();
            }

            case "Exibir impares em posições pares" -> {
                quantidadeImparesNosPares();
                menu();
            }
            case "Exibir pares em posições impares" -> {
                quantidadeParesNosImpares();
                menu();
            }
            case "Encerrar" -> {
                JOptionPane.showMessageDialog(null, "Programa encerrado com sucesso!");
            }
            default ->
                JOptionPane.showMessageDialog(null, "opção invalida");
        }
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
        JOptionPane.showMessageDialog(null, "Lista dos numeros impares:\n" + lista);
    }

    public static void exibirPares() {
        String lista = "";

        for (int i = 0; i < qntdEscolhida; i++) {
            if (numeros[i] % 2 == 0) {
                lista += "[" + i + "] - " + numeros[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Lista dos numeros pares:\n" + lista);
    }

    public static void quantidadeImparesNosPares() {
        String lista = "";

        for (int i = 0; i < qntdEscolhida; i++) {
            if (i % 2 == 0 && numeros[i] % 2 != 0) {
                lista += "[" + i + "] - " + numeros[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Lista dos numeros impares em posições pares do vetor:\n" + lista);
    }

    public static void quantidadeParesNosImpares() {
        String lista = "";

        for (int i = 0; i < qntdEscolhida; i++) {
            if (i % 2 != 0 && numeros[i] % 2 == 0) {
                lista += "[" + i + "] - " + numeros[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Lista dos numeros pares em posições impares do vetor:\n" + lista);

    }

}
