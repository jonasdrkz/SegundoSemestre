package aula_04_09;

public class metodoSemRetorno {
    
    public static void executarTudo(){
        imprimir();
        imprimirTexto("Boa noite!");
        somar(2, 4);
        quadrado(8);
        maior(5, 7, 8);
        sexo('F');
    }

    public static void imprimir() {
        System.out.println("Aprendendo linguagem Java");
    }

    public static void imprimirTexto(String texto) {
        System.out.println(texto);
    }

    public static void somar(int a, int b) {
        System.out.println("somar: " + (a + b));
    }

    public static void quadrado(int a) {
        System.out.println(Math.pow(a, 2));
    }

    public static void maior(int a, int b, int c) {
        System.out.println(Math.max(a, Math.max(c, b)));
    }

    public static void sexo(char c) {

        switch (c) {
            case 'F' ->
                System.out.println("Feminino");
            case 'M' ->
                System.out.println("masculino");

            default ->
                System.out.println("Desconhecido");
        }
    }
}
