/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BatalhaPersonagem;

/**
 *
 * @author ISABELADACOSTAMUELLE
 * 
 */


public class Personagem {

     String nome;
     int vida;
     int ataque;
    
    public Personagem (String Nome, int Vida, int Ataque){
        this.nome = Nome;
        this.vida = Vida;
        this.ataque = Ataque;
}
    
    public void atacar(Personagem oponente){
        oponente.vida -= this.ataque;
}
    public boolean estaVivo(){
        if(vida > 0){
            return true;
        } else{
            return false;
        }

}
}