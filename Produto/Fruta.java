/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produto;

/**
 *
 * @author ISABELADACOSTAMUELLE
 */
public class Fruta extends Produto{
    public Fruta() {
        super("Melancia", "Fruta", 8.00);
    }
    
    @Override
    public void detalhesPedido(){
        System.out.println("O Produto " + nome + ", custou " + preco);
    }

    
}
