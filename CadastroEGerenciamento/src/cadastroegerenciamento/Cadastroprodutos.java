/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroegerenciamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * construtor fornecido pela maquina!!
 * 
 * 
 * 
 * comentario importante para explicar sobre o desenvolvimento, é que o projeto foi feito primeiro em python e dpois tentei traduzir a logica para o java, os projetos usados como base estao no github e 
 * teve uso de ia para ajuda de tradução de algumas linhas que eu nao sabia como seriam traduzidas para o java
 * 
 * linhas que foram feitas com ajuda da ia para tradução de uma linguagem para outra: 
 * não tinha certeza de como era o in em java
 * não sabia como acessar a localização das coisas dentro da lista produtos.get(nome)
 * hashset<> para eliminar duplicatas numa lista do gerador de codigos automatico, equivalente do set do python que eu tambem nao conhecia
 * tipo integer para lista (perguntar depois se é utilizado)
 * essa parte de geração de codigo automatico ta muito dificil pra traduzir com gpt, ele fala sobre muitas instancias que nao entendo e nao sei se tem como simplificar
 * 
 * 
 * 
 */


/**
 * 
 * public void geradorDeCodigo(){
 *      list<Integer> codigos = new hashset<Integer>;
 *      codigo = 100;
 * if (!temp.isEmpty()) {
 *       Set<Integer> numeros = new HashSet<>(codigos);
 *
 *       Set<Integer> esperado = new HashSet<>();
 *
 *
 * for (int numero = Collections.min(numeros){
 *           numero <= Collections.max(numeros);
 *            numero++) 
 *           esperado.add(numero);
 *   }
 *
 *       esperado.removeAll(numeros);
 *
 *       ArrayList<Integer> faltantes = new ArrayList<>(esperado);
 *      Collections.sort(faltantes);
 *   }
 *   if (!faltantes.isEmpty()) {
        codigo = String.valueOf(faltantes.get(0));
    } else {
        codigo = String.valueOf(Collections.max(temp) + 1);
    }

    } else {
        codigo = 100;
    }
    return codigo;
 * }
 * 
 */





public class Cadastroprodutos {
    Scanner input = new Scanner(System.in);
    private List<Produto> produtos = new ArrayList<Produto>();

    
    public void cadastrarNovoProduto(Produto produto) {  
        System.out.println("Digite o codigo do produto a ser cadastrado");
        int codigoProduto = input.nextInt();

        for (Produto p : produtos) {
            if (p.getCodigo() ==  codigoProduto){
                System.out.println("código de produto ja existente, o produto não pode ser cadastrado."); 
                return;
            }     
        }
     
        System.out.println("Digite o nome do produto a ser cadastrado");
        String nomeProduto = input.nextLine();
        
        System.out.println("Digite a descricao do produto a ser cadastrado");
        String descProduto = input.nextLine();
       
        System.out.println("digite o valor do produto a ser cadastrado");
        double precoProduto = input.nextDouble();
        
        System.out.println("digite o valor do produto a ser cadastrado");
        int qtdEmEstoque = input.nextInt();
        //produtos.add(produto);
        produtos.add(new Produto(codigoProduto, nomeProduto, descProduto, precoProduto, qtdEmEstoque));
    }
    
    public int encontrarProduto() {
        System.out.println("Digite o codigo do produto a ser procurado");
        int codigoProduto = input.nextInt();
        for (Produto p: produtos) {
            if (p.getCodigo() == codigoProduto) {
                int index = produtos.indexOf(codigoProduto);
                int nome = index+1;
                int desc = index+2;
                int preco = index+3;
                int quantidade = index+4;
                System.out.println("informações do produto");
                System.out.println("nome: " + produtos.get(nome));
                 System.out.println("\n");
                System.out.println("descricao: "+ produtos.get(desc));
                 System.out.println("\n");
                System.out.println("preco: " + produtos.get(preco));
                 System.out.println("\n");
                System.out.println("quantia no estoque: "+produtos.get(quantidade));

            } else {
                System.out.println("o codigo informado nao corresponde a nenhum produto");
            }
        }
        return codigoProduto;
    }
    
    public void listarProdutos(){
        if (!produtos.isEmpty()){
            for (Produto p : produtos){
                System.out.println("codigo dos produtos cadastrados: " + p.getCodigo());
                System.out.println("nome dos produtos cadastrados: " + p.getNome());
                System.out.println("preco dos produtos cadastrados: " + p.getPreco());
                System.out.println("quantidade no estoque dos produtos cadastrados: " + p.getQuantidade());
                System.out.println("\n");
                return;
            }   
        }
    }
    
    public void atualizarProduto(){
        encontrarProduto();
        
        
        
 
        
    }
    
    public void removerProduto(Produto produto){
        produtos.remove(produto);
    }
        
        
        
}
