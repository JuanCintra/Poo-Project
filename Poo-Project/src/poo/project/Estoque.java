
package poo.project;


//teste
public class Estoque {
    
    byte tipo;
    String cor;
    int codigoProduto;
    int quantidade=0;
    float preco;
    
    public Estoque(byte tipo, String cor,int codigoProduto, int quantidade,float preco){
        this.tipo = tipo;
        this.cor = cor;
        this.codigoProduto = codigoProduto;
        this.quantidade=quantidade;
        this.preco=preco;
       
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
     public void setPreco(float preco) {
        this.preco= preco;
    }
    public float getPreco() {
        return preco;
    }
  
    
    
    
    
}
