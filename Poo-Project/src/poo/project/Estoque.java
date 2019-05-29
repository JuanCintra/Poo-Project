
package poo.project;



public class Estoque {
    
    byte tipo;
    String cor;
    int codigoProduto;
    int quantidade=0;
    
    public Estoque(byte tipo, String cor,int codigoProduto, int quantidade){
        this.tipo = tipo;
        this.cor = cor;
        this.codigoProduto = codigoProduto;
        this.quantidade=quantidade;
       
    }

    public byte getTipo() {
        return tipo;
    }
    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
    public int getCodigoProduto() {
        return codigoProduto;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
    
    
    
    
}
