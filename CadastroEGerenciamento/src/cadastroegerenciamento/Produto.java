/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroegerenciamento;

/**
 *
 * @author evely
 */
public class Produto {
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
        return 1;
    }
    
    public int retirarEstoque(int quantidade) {
        return 1;
    }
    
    public void calcularValorEstoque() {
        
    }
    
    
}
