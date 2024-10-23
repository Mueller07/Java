/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BatalhaPersonagem;

/**
 *
 * @author ISABELADACOSTAMUELLE
 */
public class Mago extends Personagem{
    public Mago(String Nome){
        super(Nome, 135, 50);
    
}
    public void lancarFeitico(Personagem oponente){
        oponente.vida -= this.ataque + 17;
        System.out.println(this.nome + "Usou o poder especial e causou mais dano no" + oponente.nome);
    }
}
