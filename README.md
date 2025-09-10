TDE 01 – Manipulação de Pilhas e Filas Dinâmicas

Aluno: Vinicius Souza Penhorato
Turma: A


 Estrutura do projeto

- `Node.java` → Classe nó da lista encadeada, utilizada em Pilha e Fila.
- `PilhaEncadeada.java` → Implementação da pilha dinâmica com métodos `insere`, `remove` e `imprime`.
- `FilaEncadeada.java` → Implementação da fila dinâmica com métodos `insere`, `remove` e `imprime`.
- `Merge.java` → Implementação da operação de merge:
- `mergeVetor` → Merge feito com vetores.
- `mergeLista` → Merge feito com filas encadeadas.

Como compilar e executar

1. Compile todos os arquivos `.java`:
   ```bash
   javac Node.java PilhaEncadeada.java FilaEncadeada.java Merge.java
   ```
2. Para executar cada atividade:
   - **Pilha**:
     ```bash
     java PilhaEncadeada
     ```
   - **Fila**:
     ```bash
     java FilaEncadeada
     ```
   - **Merge**:
     ```bash
     java Merge
     ```


 Exemplos de execução

1) Pilha

1 - Inserir
2 - Remover
3 - Imprimir
0 - Sair

Opção: 1
Valor: 10
Opção: 1
Valor: 20
Opção: 3
Pilha: 20 10
Opção: 2
Removido: 20


 2) Fila

1 - Inserir
2 - Remover
3 - Imprimir
0 - Sair

Opção: 1
Valor: 5
Opção: 1
Valor: 15
Opção: 3
Fila: 5 15
Opção: 2
Removido: 5


 3) Merge com Vetor
Entrada:
- Vetor A: {12, 35, 52, 64}
- Vetor B: {5, 15, 23, 55, 75}

Saída:
Merge com vetor: 5 12 15 23 35 52 55 64 75


 4) Merge com Lista Encadeada
Entrada:
- Fila A: 12 → 35 → 52 → 64
- Fila B: 5 → 15 → 23 → 55 → 75

Saída:
Merge com lista encadeada: 5 12 15 23 35 52 55 64 75



