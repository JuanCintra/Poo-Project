/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.project;

import java.math.BigInteger;

/**
 *
 * @author isagu
 */
public interface ClienteInt {
    public String getNome();
    public void setNome(String nome);
    public BigInteger getTelefone();
    public void setTelefone(BigInteger telefone) ;
    public void setCpf(BigInteger cpf);
    public BigInteger getCpf();
    public void setIdade(byte idade);
    public byte getIdade() ;
    public void setSexo(String Sexo);
    public String getSexo();
    public int getIdVenda();
    public void setIdVenda(int idVenda);
}
