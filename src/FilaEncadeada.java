import java.util.Scanner;

public class FilaEncadeada {
    private Node inicio;
    private Node fim;

    public FilaEncadeada() {
        inicio = null;
        fim = null;
    }

    public boolean vazia() {
        return inicio == null;
    }

    public void insere(int valor) {
        Node novo = new Node(valor);
        if (fim == null) {
            inicio = novo;
            fim = novo;
        } else {
            fim.setProx(novo);
            fim = novo;
        }
    }

    public int remove() {
        if (vazia()) {
            throw new IllegalStateException("Fila vazia");
        }
        int valor = inicio.getDado();
        inicio = inicio.getProx();
        if (inicio == null) {
            fim = null;
        }
        return valor;
    }

    public void imprime() {
        Node atual = inicio;
        System.out.print("Fila: ");
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProx();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaEncadeada fila = new FilaEncadeada();
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
                fila.insere(valor);
            } else if (opcao == 2) {
                try {
                    valor = fila.remove();
                    System.out.println("Removido: " + valor);
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            } else if (opcao == 3) {
                fila.imprime();
            }
        } while (opcao != 0);

        sc.close();
    }
}
