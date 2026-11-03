/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author evely
 */
public class Produto {
    Scanner input = new Scanner(System.in);
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;

    public Produto(int codigo, String nome, String descricao, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    public int adicionarEstoque(int quantidade){
        System.out.println("digite a quantidade a ser adicionada ao estoque");
        int qtd = input.nextInt();
        if (qtd < 0){
            System.out.println("não é possivel retirar uma quantia negativa do estoque");
            return quantidade;
        }else {
        return quantidade + qtd; 
        } 
    }
    
    public int retirarEstoque(int quantidade) {
        System.out.println("digite a quantia que deve ser retirada do estoque");
        int qtd = input.nextInt();
        if (quantidade < qtd){
            System.out.println("não é possivel retirar essa quantia do estoque, pois ultrapasssa a quantia disponivel");
            return quantidade;
        }else{ 
        return quantidade - qtd;
        }
    }
    
    public double calcularValorEstoque() {
        return preco * quantidade;  
    } 
   
}
