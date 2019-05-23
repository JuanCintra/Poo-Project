
package poo.project;

import java.math.BigInteger;


public abstract class Venda extends Estoque {
    int idVenda;
    private int quantidade;
    
    
    public Venda(int idVenda,byte tipo, String cor,int codigoProduto, int quantidade){ 
        super(tipo, cor, codigoProduto, quantidade);
        this.idVenda= idVenda;
        this.tipo = tipo;
        this.cor = cor;
        this.codigoProduto = codigoProduto;
        this.quantidade = quantidade;
    }
    public int getIdVenda(){
        return idVenda;
}
    public void setIdVenda(int idVenda){
        this.idVenda=idVenda;
    }
    
}
