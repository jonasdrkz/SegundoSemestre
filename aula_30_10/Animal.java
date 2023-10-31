package aula_30_10;

import javax.swing.JOptionPane;

public class Animal {

    //atributos 
    String nome;
    String especie;
    String cor;
    int idade;
    float peso;

    //construtor default
    public Animal() {

    }

    public Animal(String nome, String especie, String cor, int idade, float peso) {
        this.nome = nome;
        this.especie = especie;
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
    }
    
    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
       
    }
    
    //metodos sem retorno
    public void alimentar(){
        JOptionPane.showInputDialog("O animal esta se alimentando");
    }
    
    //metodo com retorno
    public String movimentar(){
        String move = JOptionPane.showInputDialog("Como ele se movimenta");
        return move;
    }
    
    //metodo com argumento
    public float calcularTamanho(float comprimento, float largura){
        float tamanho = comprimento +largura;
 
        return tamanho;
    }
    
}
