// 2 - Criar uma Classe Vetor com todos os métodos para manipular os dados;

public class Vetor {
    private Consulta[] elementos;
    private int tamanho;
    private int quantidade;

    // método construtor
    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        this.elementos = new Consulta[tamanho];
        this.quantidade = 0;
    }

    // método para adicionar ao vetor
    public void adicionar(Consulta item) {
        if (quantidade == tamanho) {
            this.aumentaCapacidade();
            this.quantidade++;
        }

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == null) {
                elementos[i] = item;
                quantidade++;
                break;
            }
        }
    }

    // método sobrescrito para adicionar ao vetor (com indice)
    public void adicionar(int index, Consulta item) throws Exception {
        if (index < 0 || index > quantidade) {
            throw new Exception("Indice fora dos limites");
        }

        if (quantidade == tamanho) {
            this.aumentaCapacidade();
        }
        for (int i = quantidade - 1; i >= index; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[index] = item;
        this.quantidade++;
    }

    // método para adicionar elemento no início do vetor
    public void adicionarInicio(Consulta item) {
        if (quantidade == tamanho) {
            this.aumentaCapacidade();
        }
        for (int i = quantidade - 1; i >= 0; i--) {
            elementos[i + 1] = elementos[i];
        }
        this.elementos[0] = item;
        this.quantidade++;
    }

    // método para adicionar elemento no fim do vetor
    public void adicionarUltimo(Consulta item) {
        if (quantidade == tamanho) {
            this.aumentaCapacidade();
        }
        this.elementos[quantidade] = item;
        this.quantidade++;
    }

    // método que retorna um elemento baseado no índice
    public String busca(int index) throws Exception {
        if (index < 0 || index >= quantidade) {
            throw new Exception("Indice fora dos limites");
        }
        return elementos[index].toString();
    }
    
    // método sobrescrito que retorna o index do elemento
    public int busca(Consulta item) throws Exception {
        for (int i = 0; i < quantidade; i++) {
            if (elementos[i] == item) {
                return i;
            }
        }
        throw new Exception("Elemento nao encontrado");
    }

    // método que retorna o primeiro elemento
    public String buscaPrimeiro() throws Exception {
        if (!isVazio()) {
            return elementos[0].toString();
        }
        throw new Exception("O vetor esta vazio");
    }

    // método que retorna o último elemento
    public String buscaUltimo() throws Exception {
        if (!isVazio()) {
            return elementos[quantidade - 1].toString();
        }
        throw new Exception("O vetor esta vazio");
    }

    // método que remove um elemento pelo index
    public void remove(int index) throws Exception {
        if (index < 0 || index >= quantidade) {
            throw new Exception("Indice fora dos limites");
        } else {
            for (int i = index; i < quantidade - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.elementos[quantidade - 1] = null;
            this.quantidade--;
        }
    }

    // método sobrescrito que remove um elemento pelo objeto
    public void remove(Consulta item) throws Exception {
        if (this.contem(item)) {
            int pos = -1;

            for (int i = 0; i < quantidade; i++) {
                if (elementos[i] == item) {
                    pos = i;
                    break;
                }
            }

            if (pos != -1) {
                for (int i = pos; i < quantidade - 1; i++) {
                    elementos[i] = elementos[i + 1];
                }
                elementos[quantidade - 1] = null;
                quantidade--;
            }
        } else {
            throw new Exception("Esse item nao existe no vetor");
        }
    }

    // método para alterar elemento pelo índice
    public boolean alterar(int index, Consulta item) {
        if (!this.isVazio()) {
            if (index > this.quantidade || index < 0) {
                if (!this.contem(item)) {
                    return false;
                }
                elementos[index] = item;
                return true;
            }
            return false;
        }
        return false;
    }

    // método privado que dobra a capacidade máxima do vetor quando atingida
    private void aumentaCapacidade() {
        if (quantidade == elementos.length) {
            Consulta[] elementosNovos = new Consulta[elementos.length * 2];
            for (int i = 0; i < quantidade; i++) {
                elementosNovos[i] = elementos[i];
            }
            this.elementos = elementosNovos;
            this.tamanho = elementosNovos.length;
        }
    }

    // método para limpar o vetor
    public void limpar() {
        for (int i = 0; i < quantidade; i++) {
            elementos[i] = null;
        }
        this.quantidade = 0;
    }

    // método que retorna o tamanho do vetor
    public int tamanho() {
        return this.tamanho;
    }

    // método que retorna a quantidade elementos no vetor
    public int quantidadeAtual() {
        return this.quantidade;
    }
    
    // método que verifica se o vetor está vazio
    public boolean isVazio() {
        if (quantidade == 0) {
            return true;
        }
        return false;
    }

    // método que verificia se o vetor possui X objeto
    public boolean contem(Consulta item) {
        for (int i = 0; i < quantidade; i++) {
            if (elementos[i] == item) {
                return true;
            }
        }
        return false;
    }

    // método toString
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[ ");

        for (int i = 0; i < quantidade - 1; i++) {
            string.append(elementos[i]);
            string.append(", ");
        }

        if (quantidade > 0) {
            string.append(elementos[quantidade - 1]);
        }

        string.append(" ]");

        return string.toString();
    }

}