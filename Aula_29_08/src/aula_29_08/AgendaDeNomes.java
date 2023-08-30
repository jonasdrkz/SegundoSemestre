package aula_29_08;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class AgendaDeNomes {

    public static void main(String[] args) {

        String[] nomes = {"Vinicius Rodrigues", "Vinicius Sousa", "Anna Almeida", "Carla Almeida", "Nicole Carvalho", "Paulo Almeida", "Julia Carvalho", "Evelyn Azevedo", "Giovanna Martins", "Marina Cavalcanti"};
        String procuraSobrenome, procuraNome, listaSobrenomes = "", listaNomes = "";
        
        //Procura de sobrenome
        procuraSobrenome = JOptionPane.showInputDialog("Informe o sobrenome que esta procurando:").toLowerCase();
        
        //estrutura for para achar se algum nome dos vetores contem o sobrenome desejado e assim o guardando na lista de sobrenomes
        for (int i = 0; i < 10; i++) {
            if (nomes[i].toLowerCase().endsWith(procuraSobrenome)) {
                listaSobrenomes += nomes[i] + "\n";
            }
        }
        
        //estrutura if-else para a saida informando se algum nome foi achado ou não analisando a lista de sobrenomes
        if (!listaSobrenomes.equals("")) {
            JOptionPane.showMessageDialog(null, "Nomes encontrados que tenham o sobrenome \"" + procuraSobrenome + "\":\n" + listaSobrenomes);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi encontrado ninguem com o sobrenome \"" + procuraSobrenome + "\"");
        }
        
        //Procura de nome
        procuraNome = JOptionPane.showInputDialog("Informe o nome que esta procurando:").toLowerCase();
        
        //estrutura or para achar se algum nome dos vetores contem o sobrenome desejado e assim o guardando na lista de nomes
        for (int i = 0; i < 10; i++) {
            if (nomes[i].toLowerCase().startsWith(procuraNome)) {
                listaNomes += nomes[i] + "\n";
            }
        }
        
        //estrutura if-else para a saida informando se algum nome foi achado ou não analisando a lista de nomes
        if (!listaNomes.equals("")) {
            JOptionPane.showMessageDialog(null, "Nomes encontrados que tenham o sobrenome \"" + procuraNome + "\":\n" + listaNomes);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi encontrado ninguem com o sobrenome \"" + procuraNome + "\"");
        }
        
        //Teste de arrays.sort
        JOptionPane.showMessageDialog(null, "Vetor de nomes \n"+Arrays.toString(nomes));
        
        Arrays.sort(nomes);
        JOptionPane.showMessageDialog(null, "Vetor de nomes: \n"+Arrays.toString(nomes));
    }
}