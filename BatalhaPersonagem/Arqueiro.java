/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BatalhaPersonagem;

/**
 *
 * @author ISABELADACOSTAMUELLE
 */
public class Arqueiro extends Personagem{
    public Arqueiro(String Nome){
        super(Nome, 100, 60);
}
    
    public void flecha(Personagem oponente){
        oponente.vida -= ataque + 15;
        System.out.println(this.nome + "Usou o poder especial e causou mais dano no" + oponente.nome);
    }
}