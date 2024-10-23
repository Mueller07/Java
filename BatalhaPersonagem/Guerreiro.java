/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BatalhaPersonagem;

/**
 *
 * @author ISABELADACOSTAMUELLE
 */
        
public class Guerreiro extends Personagem {

    public Guerreiro(String Nome) {
        super(Nome, 150, 48);

    }

    public void ataqueEspada(Personagem oponente) {
        oponente.vida -= this.ataque + 16;
        System.out.println(this.nome + "Usou o poder especial e causou mais dano no" + oponente.nome);

    }

}
