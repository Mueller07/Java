/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject0810;

/**
 *
 * @author ISABELADACOSTAMUELLE
 */
import java.util.Scanner;

public class Game {
    private int numberToGuess; // Número aleatório
    private Player player;
    private GuessValidator guessValidator;
    private Scanner scanner;
    

    public Game() {
        this.numberToGuess = (int) (Math.random() * 100) + 1; // Gera número aleatório entre 1 e 100
        this.player = new Player();
        this.guessValidator = new GuessValidator();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Bem-Vindo ao jogo de adivinhação," + player.getName() + "!");
        boolean hasWon = false;
        // Lógica do jogo será adicionada aqui
        
        while (!hasWon) {
            System.out.print("Digite seu palpite: ");
            int guess = scanner.nextInt();
            hasWon = guessValidator.validateGuess(guess, numberToGuess);
        }
        
        System.out.println("Parabéns, " + player.getName() + "! Você adivinhou o número.");
    }
  
}
 
