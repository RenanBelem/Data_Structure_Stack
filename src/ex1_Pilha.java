public class Pilha {
  private int topo;
  private int[] dados;
  public int max;

  public Pilha(int tamanho){
    this.topo = -1;
    this.dados = new int[tamanho];
    this.max = tamanho;
  }

  public int[] empilha(int valor){
    if (!this.cheia()){
      this.topo = this.topo + 1;
      this.dados[this.topo] = valor;
      return this.dados;
    }

    System.out.println("A pilha está cheia");
    return this.dados;
}

  public boolean cheia(){
    return this.topo + 1 == this.max;
  }

  public boolean vazia(){
    return this.topo == -1;
  }

  public int[] desempilha(){
    if (!this.vazia()) {
      this.topo = this.topo -1;
      this.dados[this.topo] = 0;
      System.out.println("A Pilha foi desempilhada!");
      return this.dados;
    }
    System.out.println("A Pilha já está vazia!");
    return this.dados;
    }
}
