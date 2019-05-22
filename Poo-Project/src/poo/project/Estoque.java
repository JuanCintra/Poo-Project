
package poo.project;



public class Estoque {
    
    byte tipo;
    String cor;
    int codigoProduto;
    int quantidadeCam=0, quantidadeCal=0;
    
    public Estoque(byte tipo, String cor,int codigoProduto){
        this.tipo = tipo;
        this.cor = cor;
        this.codigoProduto = codigoProduto;
       
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
    public void setQuantidadeCam(int quantidadeCam) {
        this.quantidadeCam = quantidadeCam;
    }
    public int getQuantidadeCam() {
        return quantidadeCam;
    }
    public void setQuantidadeCal(int quantidadeCal) {
        this.quantidadeCal = quantidadeCal;
    }
    public int getQuantidadeCal() {
        return quantidadeCal;
    }
    
    
}
