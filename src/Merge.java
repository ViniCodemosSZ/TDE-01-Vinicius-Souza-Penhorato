public class Merge {

    // VERSÃO COM VETOR
    public static void mergeVetor(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] c = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        System.out.print("Merge com vetor: ");
        for (int v : c) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    // FILA ENCADEADA PARA O MERGE
    public static class FilaEncadeada {
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
            if (vazia()) {
                inicio = novo;
            } else {
                fim.setProx(novo);
            }
            fim = novo;
        }

        public int remove() {
            if (vazia()) {
                return -1;
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
            while (atual != null) {
                System.out.print(atual.getDado() + " ");
                atual = atual.getProx();
            }
            System.out.println();
        }
    }

    // MERGE COM FILA ENCADEADA
    public static FilaEncadeada mergeLista(FilaEncadeada A, FilaEncadeada B) {
        FilaEncadeada C = new FilaEncadeada();

        int valA = A.remove();
        int valB = B.remove();

        while (valA != -1 && valB != -1) {
            if (valA < valB) {
                C.insere(valA);
                valA = A.remove();
            } else {
                C.insere(valB);
                valB = B.remove();
            }
        }

        while (valA != -1) {
            C.insere(valA);
            valA = A.remove();
        }

        while (valB != -1) {
            C.insere(valB);
            valB = B.remove();
        }

        return C;
    }

    // MAIN PARA TESTAR
    public static void main(String[] args) {
        int[] a = {12, 35, 52, 64};
        int[] b = {5, 15, 23, 55, 75};
        mergeVetor(a, b);

        FilaEncadeada A = new FilaEncadeada();
        FilaEncadeada B = new FilaEncadeada();

        A.insere(12); A.insere(35); A.insere(52); A.insere(64);
        B.insere(5); B.insere(15); B.insere(23); B.insere(55); B.insere(75);

        System.out.print("Merge com lista encadeada: ");
        FilaEncadeada C = mergeLista(A, B);
        C.imprime();
    }
}