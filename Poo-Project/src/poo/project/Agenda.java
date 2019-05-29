
package poo.project;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    
    public static void main(String[] args) {
        BigInteger cpf = null;
        
        ArrayList<Cliente> agenda = new ArrayList();
        ArrayList<Estoque> produtos = new ArrayList();
        ArrayList<Venda> vendas = new ArrayList();
      
        Scanner scn = new Scanner(System.in);
    
        byte menuV ;
        byte menuP ;
        byte menuC ;
        byte menuE ;
        int primeiroCadastro=0,loopProduto=0, idVenda=0;
        
        do{
            System.out.println("1) Vendas");
            System.out.println("2) Estoque");
            System.out.println("3) Clientes");
            System.out.println("4) Sair");
            System.out.println("____________________________________");
            
            menuP=scn.nextByte();
            if(menuP==0||menuP>5){
              System.out.println("Número inválido");
            }
            
            switch(menuP){
                
                //Vendas
                case 1:
                    //Começo do case 1 (
                       
                    do{
                        System.out.println("1) Nova Venda");
                        System.out.println("2) Procurar Venda");
                        System.out.println("3) Excluir Venda");
                        System.out.println("4) Voltar");
                        System.out.println("____________________________________");
                        menuV=scn.nextByte();
                        if(menuV==0 || menuV>4){
                           System.out.println("Número inválido");
                       }
                        switch(menuV){
                            case 1:
                                //Começo do Case 1 Vendas
                                System.out.println("Cliente já tem cadastro?\n1 - Sim\n2 - Não");
                                int w,loopVenda=0;
                                w=scn.nextInt();
                                
                                //Buscar Cliente em Vendas
                                if(loopVenda==0){
                                if(w==1){
                                  System.out.println("Sua lista tem "+vendas.size()+" clientes");

                                //verifica se o ArrayList esta vazio
                                if (agenda.isEmpty()) {
                                    System.out.println("Sua lista não tem clientes");
                                }else{

                                    System.out.print("Qual cliente você deseja buscar? "); 
                                    String buscar = scn.next();
                                    
                                    for (int i = 0; i <agenda.size(); i++) {
                                        Cliente idCliente =  agenda.get(i);
                                        if (idCliente.getNome().equalsIgnoreCase(buscar)) {
                                            vendas.get(i);
                                            String nome=idCliente.getNome();
                                            byte idade=idCliente.getIdade();
                                            String sexo=idCliente.getSexo();
                                            cpf=idCliente.getCpf();
                                            BigInteger telefone=idCliente.getTelefone();
                                            System.out.println("Digite o Código do produto");
                                            int codigoProduto=scn.nextInt();
                                            int produtoExiste=0;

                                            //verifica se o ArrayList esta vazio
                                            if (produtos.isEmpty()) {
                                                System.out.println("Sua lista não tem produtos");
                                            }else{
                                                int buscarP = codigoProduto;

                                                for (i = 0; i <produtos.size(); i++) {
                                                    Estoque idEstoque =  produtos.get(i);
                                                    if (idEstoque.getCodigoProduto()==buscarP) {
                                                            produtoExiste++;
                                                            System.out.println("Digite a Quantidade:");
                                                            int quantidade=scn.nextInt();
                                                            while(quantidade==0){
                                                                System.out.println("A quantidade não pode ser zero. Insira Novamente:");
                                                                quantidade=scn.nextInt();
                                                            }
                                                            
                                                            if((idEstoque.getQuantidade()-quantidade)>=0){
                                                            idEstoque.setQuantidade(idEstoque.getQuantidade()-quantidade);
                                                            String cor=idEstoque.getCor();
                                                            byte tipo=idEstoque.getTipo();
                                                            idVenda++;
                                                            System.out.println("O ID da venda é " + idVenda);
                                                            vendas.add(new Venda(idVenda, tipo, cor, codigoProduto, quantidade,nome,idade,cpf,sexo,telefone));
                                                            System.out.println("\nVENDA CADASTRADA COM SUCESSO!");
                                                            }
                                                            else{
                                                                System.out.println("O estoque tem " + idEstoque.getQuantidade() + " produto(s)!");
                                                                loopVenda++;
                                                            }

                                                    } 
                                            }
                                                if(produtoExiste==0){
                                                        System.out.println("Produto não existe");
                                                    }
                                                    }
                                                }
                                        else{
                                            System.out.println("Cliente não existe.");
                                        }
                                            }
                                }
                                

                                    
                                }
                        }
                           
                              if(w==2){
                                //Cadastrar clientes
                                System.out.print("Nome do cliente: "); 
                                String nome = scn.next();
                                System.out.print("Idade do cliente: "); 
                                byte idade = scn.nextByte();
                                System.out.print("CPF do cliente: "); 

                                //Validar Cpf (44-172)
                                int loop=0; 
                                while(loop==0){
                                    int  loop1=1;
                                        while(loop1==1){   
                                            Scanner entrada= new Scanner(System.in);
                                            cpf= entrada.nextBigInteger();
                                            String biStr = cpf.toString();
                                            int[] cpf1 = new int[biStr.length()];
                                            for(int i=0; i<biStr.length(); i++) {
                                                cpf1[i] = Integer.parseInt(String.valueOf(biStr.charAt(i)));
                                            }
                                            int length = biStr.length();
                                            if(length<11 || length>11){          
                                                System.out.println("O cpf deve conter 11 dígitos. Insira novamente:");
                                            }
                                            else{
                                                loop1++;
                                                break;
                                            }
                                        }
                                    int k=0,cpfigual=0;
                                    int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,l=0,j=0;
                                    String biStr = cpf.toString();
                                    int[] cpf1 = new int[biStr.length()];
                                    for(int i=0; i<biStr.length(); i++) {
                                        cpf1[i] = Integer.parseInt(String.valueOf(biStr.charAt(i)));
                                    }
                                    int length = biStr.length();
                                    if(length<11 || length>11){
                                        System.out.println("O cpf deve conter 11 dígitos.");
                                    }
                                    while(k<length){

                                        if(cpf1[k]==0){
                                            a++;
                                        }
                                        if(cpf1[k]==1){
                                            b++;
                                        }
                                        if(cpf1[k]==2){
                                            c++;
                                        }
                                        if(cpf1[k]==3){
                                            d++;
                                        }
                                        if(cpf1[k]==4){
                                            e++;
                                        }
                                        if(cpf1[k]==5){
                                            f++;
                                        }
                                        if(cpf1[k]==6){
                                            g++;
                                        }
                                        if(cpf1[k]==7){
                                            h++;
                                        }
                                        if(cpf1[k]==8){
                                            l++;
                                        }
                                        if(cpf1[k]==9){
                                            j++;
                                        }

                                        if(a==11||b==11||c==11||d==11||e==11||f==11||g==11||h==11||l==11||j==11){
                                            cpfigual=1;
                                            System.out.println("O cpf não pode conter todo os dígitos iguais!");
                                        }

                                        k++;
                                    }

                                    int y=11,z=0;
                                    b=12;
                                    c=0;

                                    for(int x=0;x<=8;x++){
                                        y--;
                                        int digitoA=0, mult=0;
                                        mult=cpf1[x]*y;
                                        z=z+mult;

                                        if(x==8){
                                            digitoA=11-(z%11);

                                            if(digitoA>=10){
                                                digitoA=0;
                                            }

                                            if(digitoA==cpf1[9] && cpfigual!=1){
                                                for(a=0;a<=9;a++){
                                                    b--;
                                                    int mult2=0,digitoB=0;
                                                    mult2=cpf1[a]*b;
                                                    c=c+mult2;                                   
                                                    if(a==9){
                                                        digitoB=11-(c%11);
                                                        if(digitoB>=10){
                                                            digitoB=0;
                                                        }
                                                        if(digitoB==cpf1[10] && cpfigual!=1){
                                                            loop=1;
                                                            break;
                                                        }
                                                        else if(digitoB!=cpf1[10] && a==9){
                                                            System.out.println("Cpf Inválido!! Insira Novamente:");
                                                            break;
                                                        }
                                                        if(a==9){
                                                            break;
                                                        }
                                                    }

                                                }   
                                            }
                                            else{
                                                if(cpfigual==1){
                                                    System.out.println("Insira Novamente:");
                                                }
                                                else{
                                                System.out.println("Cpf Inválido!! Insira Novamente:");
                                                }
                                            }
                                        }   
                                    }
                                }
                      //Fim do validar cpf


                                System.out.print("Sexo do cliente: "); 
                                String sexo = scn.next(); 
                                System.out.print("Número de Telefone do cliente: "); 
                                BigInteger telefone = scn.nextBigInteger();
                                System.out.println("Digite o Código do produto");
                                int codigoProduto=scn.nextInt();
                                int produtoExiste=0;
                                
                                //verifica se o ArrayList esta vazio
                                if (produtos.isEmpty()) {
                                    System.out.println("Sua lista não tem produtos");
                                }else{

                                    int buscar = codigoProduto;

                                    for (int i = 0; i <produtos.size(); i++) {
                                        Estoque idEstoque =  produtos.get(i);
                                        
                                        

                                        if (idEstoque.getCodigoProduto()==buscar) {
                                                produtoExiste++;
                                                System.out.println("Digite a Quantidade:");
                                                int quantidade=scn.nextInt();
                                                if(quantidade==0){
                                                    System.out.println("A quantidade não pode ser zero. Venda Interrompida.");
                                                    break;
                                                }
                                                if((idEstoque.getQuantidade()-quantidade)>=0){
                                                idEstoque.setQuantidade(idEstoque.getQuantidade()-quantidade);
                                                String cor=idEstoque.getCor();
                                                byte tipo=idEstoque.getTipo();
                                                idVenda++;
                                                System.out.println("O ID da venda é " + idVenda);
                                                agenda.add(new Cliente(nome,idade,cpf,sexo,telefone));
                                                vendas.add(new Venda(idVenda, tipo, cor, codigoProduto, quantidade,nome,idade,cpf,sexo,telefone));
                                                
                                                System.out.println("\nVENDA CADASTRADA COM SUCESSO!");
                                                }
                                                else{
                                                    System.out.println("O estoque tem " + idEstoque.getQuantidade() + " produto(s)!");
                                                }
                                           
                                        }  
                                }
                                    if(produtoExiste==0 ){
                                            System.out.println("Produto não existe. Venda Interrompida");
                                        }
                                }
                                
                                
                                
                                
                                
                                  
                              }
                                  //fim do cadastrar cliente
                               
                           
                                
                                System.out.println("_____________________________________");

                                
                                
                                
                                break;
                                
                            case 2:
                                //Buscar Venda
                                
                                int vendaExiste=0;
                                //verifica se o ArrayList esta vazio
                                if (vendas.isEmpty()) {
                                    System.out.println("Sua lista não tem vendas");
                                }else{

                                    System.out.print("Insira o ID da Venda: ");
                                    int buscar = scn.nextInt();

                                    for (int i = 0; i <vendas.size(); i++) {
                                        Venda idVendas =  vendas.get(i);
                                        

                                        if (idVendas.getIdVenda()==buscar) {
                                            
                                                vendaExiste++;
                                                vendas.get(i);
                                            System.out.printf("%-7s%10s%7s%13s%11s%13s%6s%n","Cliente", "Nome","Idade","CPF", "Sexo", "Telefone","ID");
                                            System.out.printf("       %10S%7d%13s%11s%13s%6d%n%n",idVendas.getNome(),idVendas.getIdade(),
                                                    idVendas.getCpf(), idVendas.getSexo(), idVendas.getTelefone(),idVendas.getIdVenda());
                                            for (i = 0; i <vendas.size(); i++) {
                                              idVendas = vendas.get(i);
                                                if (idVendas.getIdVenda()==buscar) {
                                                  if(idVendas.getTipo()==1){
                                                    System.out.printf("%-30s%7s%11s%19s%n","Código do Produto","Tipo","Cor","Quantidade");
                                                    System.out.printf("%-30d%7s%11s%19d%n",idVendas.getCodigoProduto(),"Camisa",idVendas.getCor(),idVendas.getQuantidade());
                                                  }
                                                  if(idVendas.getTipo()==2){
                                                    System.out.printf("%-30s%7s%11s%19s%n","Código do Produto","Tipo","Cor","Quantidade");
                                                    System.out.printf("%-30d%7s%11s%19d%n",idVendas.getCodigoProduto(),"Calça",idVendas.getCor(),idVendas.getQuantidade());
                                                  } 
                                                }
                                            }
                                        }    
                                    }
                                    if(vendaExiste==0){
                                            System.out.println("Venda não existe");
                                        }
                                }
                                
                                System.out.println("_____________________________________");
                                break;        
                                
                            case 3:
                                //Excluir Venda
                                vendaExiste=0;
                                if (vendas.isEmpty()) {
                                    System.out.println("Sua lista não tem vendas");
                                }else{
                                
                                    System.out.print("Qual venda vai remover? Insira o ID: ");
                                    int rem= scn.nextInt();

                                    for (int i = 0; i <vendas.size(); i++) {
                                        Venda idVendas =  vendas.get(i);
                                        if (idVendas.getIdVenda()==rem) {
                                            vendaExiste++;
                                            vendas.remove(i);
                                            System.out.println("Venda removida.");
                                            
                                        }
                                    }
                                    if(vendaExiste==0){
                                            System.out.println("Venda não existe");
                                        }
                                    }

                                System.out.println("____________________________________");

                                break;
                            case 4:                                
                                menuV=4;
                                break;
                            default: 
                                menuV=0;
                                break;
                        }
                    }
                    while(menuV!=4);
                break;
        
                //Estoque
                case 2:
                    //Começo do case 2 (

                    do{
                        System.out.println("1) Cadastrar Produto");
                        System.out.println("2) Buscar Produto");
                        System.out.println("3) Excluir Produto");
                        System.out.println("4) Voltar");  
                        System.out.println("____________________________________");
                        menuE=scn.nextByte();
                        if(menuE==0||menuE>4){
                           System.out.println("Número inválido");
                       }
                        switch(menuE){
                            //Cadastrar Produto
                            case 1:
                                String cor;
                                int quantidade=0;
                                System.out.println("Insira o código do produto:");
                                int codigoProduto=scn.nextInt();
                                
                                //Se o produto já existir
                                
                                //Se não
                                if(primeiroCadastro==0){
                                System.out.println("Insira o Tipo do produto:\n 1) Camisa\n 2) Calça");
                                byte tipo=scn.nextByte();
                                while(tipo>2 || tipo<1){
                                    System.out.println("O Tipo do produto só pode ser Camisa ou Calça. Insira o Tipo do produto novamente:\n 1) Camisa\n 2) Calça");
                                    tipo=scn.nextByte();
                                }
                                //Camisa ou Calça
                                if(tipo==1){
                                    System.out.println("Insira a cor da Camisa:");
                                    cor=scn.next();  
                                    System.out.println("Insira a quantidade:");
                                    quantidade=scn.nextInt();
                                    
                                }
                                else{
                                    System.out.println("Insira a cor da Calça:");
                                    cor=scn.next();
                                    System.out.println("Insira a quantidade:");
                                    quantidade=scn.nextInt();
                                    }
                                    System.out.println("PRODUTO CADASTRADO COM SUCESSO!");
                                produtos.add(new Estoque(tipo,cor,codigoProduto,quantidade));
                                primeiroCadastro++;
                                }        
                                
                                
                                else{
                                for(int i=0;i<produtos.size();i++){
                                    Estoque idEstoque = produtos.get(i);
                                    if(idEstoque.getCodigoProduto()==codigoProduto){
                                        
                                        loopProduto++;
                                        System.out.println("Insira a quantidade:");
                                        quantidade=scn.nextInt();
                                        int quantidadeEstoque=idEstoque.getQuantidade();
                                        idEstoque.setQuantidade(quantidadeEstoque+=quantidade);
                                        }
                                    
                                        
                                    
                                    }
                                 if(loopProduto==0){
                                     System.out.println("Insira o Tipo do produto:\n 1) Camisa\n 2) Calça");
                                byte tipo=scn.nextByte();
                                //Erro para o tipo da roupa
                                while(tipo>2 || tipo<1){
                                    System.out.println("O Tipo do produto só pode ser Camisa ou Calça. Insira o Tipo do produto novamente:\n 1) Camisa\n 2) Calça");
                                    tipo=scn.nextByte();
                                }

                                //Camisa ou Calça
                                if(tipo==1){
                                    System.out.println("Insira a cor da Camisa:");
                                    cor=scn.next();  
                                    System.out.println("Insira a quantidade:");
                                    quantidade=scn.nextInt();
                                }
                                else{
                                    System.out.println("Insira a cor da Calça:");
                                    cor=scn.next();
                                    System.out.println("Insira a quantidade:");
                                    quantidade=scn.nextInt();
                                    }

                                produtos.add(new Estoque(tipo,cor,codigoProduto,quantidade));
                                 }
                                    
                                }
                                 
                    
                                loopProduto=0;
                                break;
                                
                            //Buscar Produto    
                            case 2:
                                System.out.println("Sua lista tem "+produtos.size()+" produtos");
                                int produtoExiste=0;
                                //verifica se o ArrayList esta vazio
                                if (produtos.isEmpty()) {
                                    System.out.println("Sua lista não tem produtos");
                                }else{

                                    System.out.print("Insira o código do produto: ");
                                    int buscar = scn.nextInt();

                                    for (int i = 0; i <produtos.size(); i++) {
                                        Estoque idEstoque =  produtos.get(i);
                                        

                                        if (idEstoque.getCodigoProduto()==buscar) {
                                            if(idEstoque.getTipo()==1){
                                                produtoExiste++;
                                                System.out.printf("%-6s%12s%12s%n","Tipo","Cor","Quantidade");
                                                System.out.printf("%-6s%12s%12d%n","Camisa",idEstoque.getCor(),idEstoque.getQuantidade());
                                            }
                                            if(idEstoque.getTipo()==2){
                                               produtoExiste++;
                                                System.out.printf("%-5s%12s%12s%n","Tipo","Cor","Quantidade");
                                                System.out.printf("%-5s%12s%12d%n","Calça",idEstoque.getCor(),idEstoque.getQuantidade());
                                            }
                                        }
                                        
                                    }
                                    if(produtoExiste==0){
                                            System.out.println("Produto não existe");
                                        }
                                }
                                
                                System.out.println("_____________________________________");

                                break;
                                
                            //Excluir Produto
                            case 3:
                                produtoExiste=0;
                                if (produtos.isEmpty()) {
                                    System.out.println("Sua lista não tem produtos");
                                }else{
                                
                                    System.out.print("Qual produto vai remover? Insira o código: ");
                                    int rem= scn.nextInt();

                                    for (int i = 0; i <produtos.size(); i++) {
                                        Estoque idEstoque =  produtos.get(i);
                                        if (idEstoque.getCodigoProduto()==rem) {
                                            produtoExiste++;
                                            produtos.remove(i);
                                            System.out.println("Removido.");
                                            
                                        }
                                    }
                                    if(produtoExiste==0){
                                            System.out.println("Produto não existe");
                                        }
                                    }

                                System.out.println("____________________________________");

                            break;
                            
                               
                            case 4:                                
                                menuE=4;
                                break;
                            default:
                                menuE=0;
                        }                                                
                    }
                    while(menuE!=4);
                    break;
                    
                    
                //Cadastrar Cliente    
                case 3:
                    //Começo do case 3 (30-260)
                    do {
                        //menu
                        System.out.println("1) Buscar cliente");
                        System.out.println("2) Excluir cliente");
                        System.out.println("3) Imprimir cliente");
                        System.out.println("4) Voltar");

                        System.out.println("____________________________________");

                        menuC = scn.nextByte();

                        //Msg de erro
                        if(menuC==0 || menuC>4){
                           System.out.println("Número inválido");
                       }

                        switch(menuC){
                           
                            //Buscar Clientes
                            case 1:

                                System.out.println("Sua lista tem "+agenda.size()+" clientes");

                                //verifica se o ArrayList esta vazio
                                if (agenda.isEmpty()) {
                                    System.out.println("Sua lista nao tem clientes");
                                }else{

                                    System.out.print("Qual cliente voce deseja buscar? "); 
                                    String buscar = scn.next();

                                    for (int i = 0; i <agenda.size(); i++) {
                                        Cliente idCliente =  agenda.get(i);
                                        if (idCliente.getNome().equalsIgnoreCase(buscar)) {
                                            vendas.get(i);
                                            System.out.printf("%-10s%7s%13s%11s%13s%n", "Nome","Idade","CPF", "Sexo", "Telefone");
                                            System.out.printf("%-10S%7d%13s%11s%13s%n" ,idCliente.getNome(),idCliente.getIdade(),
                                                    idCliente.getCpf(), idCliente.getSexo(), idCliente.getTelefone());
                                        }
                                    }
                                }

                                System.out.println("_____________________________________");

                            break;
                            
                            //Excluir Clientes
                            case 2:

                                System.out.print("Qual cliente vai remover: ");
                                String rem= scn.next();

                                for (int i = 0; i <agenda.size(); i++) {
                                    Cliente idCliente =  agenda.get(i);
                                    if (idCliente.getNome().equalsIgnoreCase(rem)) {
                                        agenda.remove(i);
                                        System.out.println("Removido.");
                                    }
                                }

                                System.out.println("____________________________________");

                            break;
                            
                            //Imprimir Clientes                         
                            case 3:

                                System.out.println("____________________________________");

                                System.out.printf("%-10s%10s%7s%13s%11s%13s%n","Nº", "Nome","Idade","CPF", "Sexo", "Telefone");
                                int n = 0;

                                for(Cliente a : agenda){
                                    n++;

                                    System.out.printf("%-10d%10S%7d%13s%11s%13s%n", n ,a.getNome(), a.getIdade(),a.getCpf(), a.getSexo(), a.getTelefone());
                                }
                                System.out.println("____________________________________");

                            break;
                            case 4:
                                menuC = 5;
                            break;
                            default:
                                menuC = 0;
                            break;
                        }

                    } while (menuC!=5);
                    break;
                    //Fim do case 3
                    
                case 4:
                    menuP=4;
              }   
        }
        while (menuP!=4);
        

    } 
}
