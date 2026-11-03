/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Produto;

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
 *       codigo = String.valueOf(faltantes.get(0));
 *   } else {
 *
 * codigo = String.valueOf(Collections.max(temp) + 1);
 *   }
 *
 *   } else {
 *       codigo = 100;
 *   }
 *   return codigo;
 * }
 * 
 */





public class CadastroProdutos {
    Scanner input = new Scanner(System.in);
    private List<Produto> produtos = new ArrayList<Produto>();

    public List<Produto> getProdutos() {
        return produtos;
    }
    public void cadastrarNovoProduto(Produto produto) {  
        
        for (Produto p : produtos) {
            if (p.getCodigo() ==  produto.getCodigo()){
                System.out.println("código de produto ja existente, o produto não pode ser cadastrado."); 
                return;
            }     
        }
        produtos.add(produto); 
    }
    
    public Produto encontrarProduto(Produto produto) {
  
        for (Produto p: produtos) {
            if (p.getCodigo() == produto.getCodigo()) {
                return p;
            }
        }
        return null;
    }
    
    public String listarProdutos(){
        if (!produtos.isEmpty()){
            for (Produto p : produtos){
                System.out.println("codigo dos produtos cadastrados: " + p.getCodigo());
                System.out.println("nome dos produtos cadastrados: " + p.getNome());
                System.out.println("descricao do produto: "+ p.getDescricao());
                System.out.println("preco dos produtos cadastrados: " + p.getPreco());          
                System.out.println("quantidade no estoque dos produtos cadastrados: " + p.getQuantidade());
                System.out.println("\n");
                return null;
            }   
        }return null;
    }
    
    public void atualizarProduto(Produto produto){
        
        for (Produto p : produtos) {
            if (p.getCodigo() == produto.getCodigo()){
                System.out.println("oque deseja alterar?");
                String resposta = input.nextLine();
                if (resposta.equals("nome")){
                    System.out.println("digite o novo nome do produto");
                    String nome = input.nextLine();
                    p.setNome(nome);
                }else if (resposta.equals("preco")){
                    System.out.println("digite o novo preco do produto");
                    double preco = input.nextDouble();
                    if (preco < 0){
                        System.out.println("não é possivel registrar produtos com um preço negativo");
                    }else {
                    p.setPreco(preco);
                    }
                } else if (resposta.equals("descricao")){
                    System.out.println("atualize a descricao do produto");
                    String descricao = input.nextLine();
                    p.setDescricao(descricao);
                }
                return;
                //Produto editedproduto = new Produto();
                //p = editedproduto;
                //return p;
            }
        }
    }
    
    public void removerProduto(Produto produto){
        for (Produto p : produtos) {
            if (p.getCodigo() !=  produto.getCodigo()){
                System.out.println("o codigo do produto nao existe"); 
                return;
            }     
        }
        produtos.remove(produto); 
    }
              
}
