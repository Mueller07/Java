/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BatalhaPersonagem;

/**
 *
 * @author ISABELADACOSTAMUELLE
 */

import java.util.Scanner;
        
public class jogoBatalha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o nome do seu guerreiro: ");
        String nomeGuerreiro = scanner.nextLine();
        Guerreiro guerreiro = new Guerreiro(nomeGuerreiro);

        System.out.println("Escolha o nome do seu mago: ");
        String nomeMago = scanner.nextLine();
        Mago mago = new Mago(nomeMago);

        System.out.println("Escolha o nome do seu arqueiro: ");
        String nomeArqueiro = scanner.nextLine();
        Arqueiro arqueiro = new Arqueiro(nomeArqueiro);

        while (arqueiro.estaVivo() && mago.estaVivo() && guerreiro.estaVivo()) {
            System.out.println("Escolha um personagem para atacar: "
                    + "  1 para guerreiro "
                    + " 2 para arqueiro"
                    + " 3 para mago");
            int escolhaUsuario = scanner.nextInt();
            System.out.println("Escolha seu oponente : "
                    + " 1 para guerreiro "
                    + " 2 para arqueiro "
                    + " 3 para mago");
            int escolhaOponente = scanner.nextInt();
            System.out.println("Seu personagem: " + escolhaUsuario);
            System.out.println("Seu oponente: " + escolhaOponente);

            switch (escolhaUsuario) {
                case 1:
                    switch (escolhaOponente) {
                        case 1:
                            System.out.println("O guerreiro não atacar a si mesmo");
                            break;
                        case 2:
                            System.out.println("O guerreiro atacou o arqueiro" + arqueiro.nome);
                            arqueiro.vida -= guerreiro.ataque;
                            System.out.println("Vida do arqueiro" + arqueiro.vida);
                            break;
                        case 3:
                            System.out.println("O guerreiro atacou o mago" + mago.nome);
                            mago.vida -= guerreiro.ataque;
                            System.out.println("Vida do mago" + mago.vida);
                    }
                    break;
                case 2:
                    switch (escolhaOponente) {
                        case 1:
                            System.out.println("O arqueiro nao pode atacar a si mesmo");
                            break;
                        case 2:
                            System.out.println("O arqueiro atacou o guerreiro" + guerreiro.nome);
                            guerreiro.vida -= arqueiro.ataque;
                            System.out.println("Vida do guerreiro" + guerreiro.vida);
                            break;
                        case 3:
                            System.out.println("O arqueiro atacou o mago" + mago.nome);
                            mago.vida -= arqueiro.ataque;
                            System.out.println("Vida do mago" + mago.vida);
                            
                    }
                    break;
                case 3:
                    switch(escolhaOponente){
                        case 1:
                            System.out.println("O mago nao pode atacar a si mesmo");
                            break;
                        case 2:
                            System.out.println("O mago atacou o guerreiro" + guerreiro.nome);
                            guerreiro.vida -= mago.ataque;
                            System.out.println("Vida do guerreiro" + guerreiro.vida);
                            break;
                        case 3:
                            System.out.println("O mago atacou o arqueiro" + arqueiro.nome);
                            arqueiro.vida -= mago.ataque;
                            System.out.println("Vida do arqueiro" + arqueiro.vida);
                    }
            }
        }
    }
}
                 
                            


}
