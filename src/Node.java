public class Node {
    private int dado;
    private Node prox;

    public Node(int valor) {
        this.dado = valor;
        this.prox = null;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Node getProx() {
        return prox;
    }

    public void setProx(Node prox) {
        this.prox = prox;
    }
}
