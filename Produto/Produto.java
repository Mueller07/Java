/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produto;

/**
 *
 * @author ISABELADACOSTAMUELLE
 */

public abstract class Produto {
    String nome;
    String tipo;
    double preco;
    
    public Produto(String nome, String tipo, double preco){
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        
    }
    
    abstract public void detalhesPedido();
}


