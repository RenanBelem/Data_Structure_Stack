# Arquivos Java de Estrutura de Dados: Pilha

Este repositório contém dois exemplos de implementação da estrutura de dados **Pilha (Stack)** em Java, focados em diferentes aplicações:

1.  **Exemplo 1 (`ex1_...`):** Implementação básica de uma Pilha para armazenar **números inteiros**.
2.  **Exemplo 2 (`ex2_...`):** Implementação de uma Pilha para **verificar o balanceamento de símbolos** (parênteses, colchetes e chaves) em uma fórmula aritmética.

-----

## 🚀 Exemplo 1: Pilha Básica de Inteiros

Este exemplo demonstra a criação e as operações fundamentais de uma Pilha que armazena dados do tipo `int`.

### `ex1_Pilha.java` (Implementação da Pilha)

Define a classe `Pilha` com as seguintes características e métodos:

  * **Atributos:**
      * `topo`: Posição do último elemento inserido (o topo da Pilha). Inicializado com $-1$.
      * `dados`: Array de `int` que armazena os elementos da Pilha.
      * `max`: O tamanho máximo da Pilha.
  * **Construtor:**
      * `Pilha(int tamanho)`: Inicializa o array `dados` com o tamanho especificado e `topo` com $-1$.
  * **Métodos Principais:**
      * `empilha(int valor)`: Adiciona um elemento ao topo da Pilha, se ela não estiver cheia.
      * `desempilha()`: Remove o elemento do topo da Pilha (decrementa `topo`), se ela não estiver vazia.
      * `cheia()`: Retorna `true` se a Pilha estiver cheia.
      * `vazia()`: Retorna `true` se a Pilha estiver vazia.

### `ex1_Main.java` (Classe Principal)

Contém o método `main` que apenas demonstra a criação de uma nova instância da Pilha:

  * `Pilha p = new Pilha(6);` cria uma Pilha com capacidade para 6 elementos.

-----

## ➗ Exemplo 2: Verificação de Balanceamento de Símbolos

Este exemplo utiliza a Pilha para resolver um problema comum em análise sintática (parsing): garantir que todos os símbolos de abertura (`{`, `[`, `(`) em uma fórmula tenham seus respectivos símbolos de fechamento (`}`, `]`, `)`), na ordem correta.

### `ex2_Pilha.java` (Implementação da Pilha)

Define a classe `Pilha` similar ao Exemplo 1, mas adaptada para armazenar dados do tipo **`String`** (necessário para guardar os símbolos) e com métodos específicos para esta aplicação:

  * **Métodos Adicionais/Modificados:**
      * `pegarUltimoDado()`: Retorna o elemento no topo da Pilha **sem removê-lo** (operação **peek**). Útil para verificar se o símbolo de fechamento atual corresponde ao último símbolo de abertura.
      * Os métodos `empilha`, `desempilha`, `cheia`, e `vazia` operam com `String`s.

### `ex2_Main.java` (Classe Principal)

Contém a lógica para ler uma fórmula aritmética e verificar o balanceamento de seus símbolos:

1.  Lê uma `String` (`formula`) do usuário via `Scanner`.
2.  Itera por cada caractere da `formula`.
3.  Se o caractere for um símbolo de abertura (`{`, `[`, `(`), ele é **empilhado**.
4.  Se o caractere for um símbolo de fechamento (`}`, `]`, `)`):
      * Verifica se ele **corresponde** ao símbolo no topo da Pilha (usando `pegarUltimoDado()`).
      * Se corresponderem (ex: topo é `[` e o caractere atual é `]`), o elemento do topo é **desempilhado**.
      * Se não corresponder ou a Pilha estiver vazia, o símbolo de fechamento é empilhado (o que levará à invalidação da fórmula ao final).
5.  Ao final da iteração, se a Pilha estiver **vazia**, a fórmula é considerada **válida**. Caso contrário, é **inválida** (porque sobraram símbolos de abertura ou houve um desbalanceamento).

-----

## 🛠️ Como Compilar e Executar

Para compilar e executar qualquer um dos exemplos, você precisará ter o **Java Development Kit (JDK)** instalado.

### Exemplo 1

```bash
# Compila as classes
javac ex1_Pilha.java ex1_Main.java

# Executa o programa principal
java Main
```

### Exemplo 2

```bash
# Compila as classes
javac ex2_Pilha.java ex2_Main.java

# Executa o programa principal
java Main
```

Ao executar o Exemplo 2, o programa solicitará que você insira a fórmula aritmética para ser validada.
