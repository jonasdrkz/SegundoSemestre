package aula_04_09;

import javax.swing.JOptionPane;

public class Execicio2 {

    static float extrato = 0.0f, taxa = 0;
    static String tipoLog = "";
    static int menuOpcoes;

    public static void main(String[] args) {
        login();
        menu();
    }

    public static void login() {
        String cliente = "cliente", clienteEspecial = "cliente especial";
        String log = "";

        do {
            log = JOptionPane.showInputDialog("Informe o seu login");
        } while (!log.equals(cliente) && !log.equals(clienteEspecial));

        if (log.equals(cliente)) {
            taxa = 0.5f;
            tipoLog = cliente;
        } else {
            taxa = 0.1f;
            tipoLog = clienteEspecial;
        }
    }

    public static void menu() {
        do {
            menuOpcoes = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção:\n"
                    + "1 - Depositar\n"
                    + "2 - Sacar\n"
                    + "3 - Extrato\n"
                    + "0 - Encerrar", "Menu", JOptionPane.INFORMATION_MESSAGE));

            String escolhaOpcao = Integer.toString(menuOpcoes);

            switch (escolhaOpcao) {
                case "1" -> {
                    depositar();
                }
                case "2" -> {
                    sacar();
                }
                case "3" -> {
                    mostrarExtrato();
                }
                case "0" -> {
                    JOptionPane.showMessageDialog(null, "Conta encerrada com sucesso!");
                }
                default ->
                    JOptionPane.showMessageDialog(null, "Opção invalida! Tente novamente");
            }
        } while (menuOpcoes != 0);
    }

    public static void depositar() {
        float qntdDeposito;

        do {
            qntdDeposito = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantia que deseja depositar"));
        } while (qntdDeposito <= 0);

        extrato += qntdDeposito;

        JOptionPane.showMessageDialog(null, "Foram depositados R$" + qntdDeposito);
    }

    public static void sacar() {
        float qntdSaque;

        do {
            qntdSaque = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantia que deseja sacar"));
        } while (qntdSaque  < 0 || (qntdSaque + (qntdSaque * taxa) / 100) > extrato);

        JOptionPane.showMessageDialog(null, "Foram retirados R$" + qntdSaque + "\nE mais uma taxa de " + taxa + "%");

        qntdSaque += (qntdSaque * taxa) / 100;
        extrato -= qntdSaque;

    }

    public static void mostrarExtrato() {
        JOptionPane.showMessageDialog(null, "O extrato atual da conta é de:\n"
                + "R$" + extrato);

    }
}
