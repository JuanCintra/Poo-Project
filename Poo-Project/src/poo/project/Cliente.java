package poo.project;

import java.math.BigInteger;

public class Cliente {
    private String nome,sexo;
    private BigInteger telefone;
    private byte idade;
    private BigInteger cpf;
    private int idvenda;

    public Cliente(String nome ,byte idade,BigInteger cpf,String sexo, BigInteger telefone, int idvenda) {
        
        
        
       
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.sexo = sexo;
   
    }
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public BigInteger getTelefone() {
        return telefone;
    }
    public void setTelefone(BigInteger telefone) {
        this.telefone = telefone;
    }
    public void setCpf(BigInteger cpf) {
        this.cpf = cpf;
    }
    public BigInteger getCpf() {
        return cpf;
    }
    public void setIdade(byte idade) {
        this.idade = idade;
    }
    public byte getIdade() {
        return idade;
    }
    public void setSexo(String Sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }
    public int getIdvenda() {
        return idvenda;
    }
    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }
    
        
    
    

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", CPF=" + cpf + ", telefone=" + telefone + '}';
    }
    
}
