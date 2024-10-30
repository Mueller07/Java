/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produto;

/**
 *
 * @author ISABELADACOSTAMUELLE
 */
public class Limpeza extends Produto{
    public Limpeza(){
        super ("Sabão em Pó", "Limpeza", 19.00);
    }
    
     @Override
    public void detalhesPedido(){
        System.out.println("O Produto " + nome + ", custou " + preco);
    
}
}
