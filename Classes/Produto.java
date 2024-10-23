/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ISABELADACOSTAMUELLE
 */
public class Produto {
    String nome;
    double preco;
    int quantidade;
    
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public void valorTotal() {
        System.out.println("O produto " + nome + " tem o valor total de " + quantidade * preco + "Reais");
        
    }
    
}
