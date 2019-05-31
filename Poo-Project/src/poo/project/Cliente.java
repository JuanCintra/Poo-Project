package poo.project;

import java.math.BigInteger;

public class Cliente {
    private String nome,sexo;
    private BigInteger telefone;
    private byte idade;
    private BigInteger cpf;

    public Cliente (String nome ,byte idade,BigInteger cpf,String sexo, BigInteger telefone) {
        
        
        
       
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
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }

    
        
    
    

    @Override
    public String toString() {
        return "Cliente1{" + "nome=" + nome + ", CPF=" + cpf + ", telefone=" + telefone + '}';
    }
    
}
