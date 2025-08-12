public class Vetor {
    private String[] dados;
    private int quantidade; // Quantidade atual de elementos armazenados

    public Vetor(int capacidade) {
        dados = new String[capacidade];
        quantidade = 0;
    }

    // Adiciona um elemento se houver espaço
    public boolean adicionar(String elemento) {
        if (quantidade < dados.length) {
            dados[quantidade] = elemento;
            quantidade++;
            return true; // sucesso
        } else {
            System.out.println("Vetor cheio, não é possível adicionar.");
            return false; // falha
        }
    }

    // Remove o elemento pelo valor (primeira ocorrência)
    public boolean remover(String elemento) {
        for (int i = 0; i < quantidade; i++) {
            if (dados[i].equals(elemento)) {
                // Desloca os elementos à esquerda para preencher a lacuna
                for (int j = i; j < quantidade - 1; j++) {
                    dados[j] = dados[j + 1];
                }
                dados[quantidade - 1] = null;
                quantidade--;
                return true; // sucesso
            }
        }
        System.out.println("Elemento não encontrado para remover.");
        return false; // não achou o elemento
    }

    // Percorre e imprime os elementos
    public void percorrer() {
        System.out.println("Elementos no vetor:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println(dados[i]);
        }
    }

    // Retorna a quantidade atual de elementos
    public int quantidade() {
        return quantidade;
    }

    // Busca um elemento e retorna seu índice, ou -1 se não encontrado
    public int buscar(String elemento) {
        for (int i = 0; i < quantidade; i++) {
            if (dados[i].equals(elemento)) {
                return i;
            }
        }
        return -1; // não encontrado
    }

}
