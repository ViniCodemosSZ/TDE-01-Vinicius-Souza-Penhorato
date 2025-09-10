import java.util.Scanner;

public class PilhaEncadeada {
    private Node topo;

    public PilhaEncadeada() {
        topo = null;
    }

    public boolean vazia() {
        return topo == null;
    }

    public void insere(int valor) {
        Node novo = new Node(valor);
        novo.setProx(topo);
        topo = novo;
    }

    public int remove() {
        if (vazia()) {
            throw new IllegalStateException("Pilha vazia");
        }
        int valor = topo.getDado();
        topo = topo.getProx();
        return valor;
    }

    public void imprime() {
        Node atual = topo;
        System.out.print("Pilha: ");
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProx();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilhaEncadeada pilha = new PilhaEncadeada();
        int opcao, valor;

        do {
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Imprimir");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Valor: ");
                valor = sc.nextInt();
                pilha.insere(valor);
            } else if (opcao == 2) {
                try {
                    valor = pilha.remove();
                    System.out.println("Removido: " + valor);
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            } else if (opcao == 3) {
                pilha.imprime();
            }
        } while (opcao != 0);

        sc.close();
    }
}