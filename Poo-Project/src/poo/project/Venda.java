
package poo.project;

import java.math.BigInteger;


public class Venda extends Estoque implements ClienteInt {
    private String nome,sexo;
    private BigInteger telefone;
    private byte idade;
    private BigInteger cpf;
    private int idVenda;
    
    
    public Venda(int idVenda,byte tipo, String cor,int codigoProduto, int quantidade,
            String nome ,byte idade,BigInteger cpf,String sexo, BigInteger telefone, float preco){ 
        super(tipo, cor, codigoProduto, quantidade,preco);
        this.idVenda= idVenda;
        this.tipo = tipo;
        this.cor = cor;
        this.codigoProduto = codigoProduto;
        this.quantidade = quantidade;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.sexo = sexo;
        this.idVenda = idVenda;
        this.preco = preco;
    }
    
    @Override
    public int getIdVenda(){
        return idVenda;
}
    @Override
    public void setIdVenda(int idVenda){
        this.idVenda=idVenda;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome=nome;
    }

    @Override
    public BigInteger getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(BigInteger telefone) {
        this.telefone=telefone;
    }

    @Override
    public void setCpf(BigInteger cpf) {
        this.cpf=cpf;
    }

    @Override
    public BigInteger getCpf() {
        return cpf;
    }

    @Override
    public void setIdade(byte idade) {
        this.idade=idade;
    }

    @Override
    public byte getIdade() {
        return idade;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo=sexo;
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    
    
    
}
