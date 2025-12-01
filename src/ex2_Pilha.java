public class Pilha {
    private int topo;
    private String[] dados;
    public int max;

    public Pilha(int tamanho){
        this.topo = -1;
        this.dados = new String[tamanho];
        this.max = tamanho;
    }

    public int getTopo(){
        return this.topo;
    }

    public String pegarUltimoDado(){
        return this.getTopo() != -1 ? this.dados[this.getTopo()] : null;
    }


    public void empilha(String caracter){
        if (!this.cheia()){
            this.topo = this.topo + 1;
            this.dados[this.topo] = caracter;
        }
    }

    public boolean cheia(){
        return this.topo + 1 == this.max;
    }

    public boolean vazia(){
        return this.topo == -1;
    }

    public void desempilha(){
        if (!this.vazia()) {
            this.dados[this.topo] = "";
            this.topo = this.topo -1;
        }
    }
}
