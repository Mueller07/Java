/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
   
package NOVO_Projeto;
// Importa a classe Scanner para permitir a entrada de dados do usuário
// Importa a classe Scanner para permitir a entrada de dados do usuário
import java.util.Scanner;

class NOVO_Projeto {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Declara duas variáveis inteiras para armazenar os números digitados pelo usuário
        int numero1, numero2;

        // Solicita ao usuário que digite o primeiro número
        System.out.println("Digite um número: ");
        numero1 = sc.nextInt(); // Lê o próximo inteiro digitado pelo usuário e o armazena em numero1

        // Solicita ao usuário que digite o segundo número
        System.out.println("Digite outro número: ");
        numero2 = sc.nextInt(); // Lê o próximo inteiro digitado pelo usuário e o armazena em numero2

        // Exibe a soma dos dois números
        System.out.println("Resultado: " + (numero1 + numero2));

        // Fecha o objeto Scanner para liberar os recursos utilizados
        sc.close();
    }
}
