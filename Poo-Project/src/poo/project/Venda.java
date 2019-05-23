
package poo.project;

import java.math.BigInteger;


public abstract class Venda {
    int idvenda;
    
    public Venda(int idvenda){
        this.idvenda=idvenda;
    }
    public int getIdvenda(){
        return idvenda;
}
    public void setIdvenda(int idvenda){
        this.idvenda=idvenda;
    }
    
}
