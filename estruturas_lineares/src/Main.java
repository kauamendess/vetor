//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adicionar("Maçã");
        vetor.adicionar("Banana");
        vetor.adicionar("Laranja");

        vetor.percorrer();
        System.out.println("Quantidade: " + vetor.quantidade());

        System.out.println("Índice da Banana: " + vetor.buscar("Banana"));

        vetor.remover("Banana");
        vetor.percorrer();
        System.out.println("Quantidade: " + vetor.quantidade());

        vetor.remover("Abacaxi"); // Teste de remoção de elemento inexistente
    }
}