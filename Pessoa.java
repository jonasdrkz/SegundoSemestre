package Orientacao_Objeto;

import javax.swing.JOptionPane;

public class Pessoa {

    //-Atributos
    String nome;
    int idade;
    boolean estaVivo;

    //-Construtotres
    Pessoa() {

    }

    Pessoa(String nomePessoa, int idadePessoa) {
        this.nome = nomePessoa;
        this.idade = idadePessoa;
    }

    Pessoa(boolean vivoOuMorto) {
        this.estaVivo = vivoOuMorto;
    }

    Pessoa(boolean vivoMorto, int idadeDoIndividuo) {
        this.estaVivo = vivoMorto;
        this.idade = idadeDoIndividuo;
    }

    public static void main(String[] args) {

        //-Primeiro objeto
        Pessoa ind1 = new Pessoa();
        ind1.estaVivo = true;
        ind1.idade = 17;
        ind1.nome = "Jonas";
        ind1.toPrint();
        System.out.println(ind1.realizarProvaDeVida("Joana",20, true));

        //-Segundo objeto
        Pessoa ind2 = new Pessoa(true);

        //-Terceiro objeto
        Pessoa ind3 = new Pessoa("Carlos", 27);

        //-Quarto objeto
        Pessoa ind4 = new Pessoa(false, 85);

        //System.out.println(ind1.nome + " / " + ind1.idade + " / " + ind1.estaVivo);
        //System.out.println(ind2.nome + " / " + ind2.idade + " / " + ind2.estaVivo);
        //System.out.println(ind3.nome + " / " + ind3.idade + " / " + ind3.estaVivo);
        //System.out.println(ind4.nome + " / " + ind4.idade + " / " + ind4.estaVivo);
    }

    //-Metodos
    public void declararStatus(boolean statusVida) {
        this.estaVivo = statusVida;
        JOptionPane.showMessageDialog(null, "O " + this.nome + "Está: " + this.estaVivo);
    }

    public void cadastrar(String nomeUsuario, int idadeUsuario) {
        this.nome = nomeUsuario;
        this.idade = idadeUsuario;
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome + "\nIdade" + this.idade);
    }

    public String realizarProvaDeVida(String nome, int idade, boolean estaVivo) {
        this.estaVivo = estaVivo;
        this.nome = nome;
        this.idade = idade;

        String vida;
        if (this.estaVivo == true) {
            vida = "Vivo";
        } else {
            vida = "Morto";
        }

        return "O " + this.nome + ""
                + "\ntem a idade de: " + this.idade
                + "\ne esta: " + vida;
    }

    public void toPrint() {
        JOptionPane.showMessageDialog(null, this.nome
                + "\ntem a idade " + this.idade
                + "\ne seu status de vida é: " + this.estaVivo);
    }
}
