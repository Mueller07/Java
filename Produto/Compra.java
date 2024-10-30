/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produto;

/**
 *
 * @author ISABELADACOSTAMUELLE
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Compra{
    public static void main(String[] args) {
    ArrayList<Produto>carrinho = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    boolean continuar = true;

    
   while(continuar) {
       System.out.println("1 - Adicionar um item \n 2 - Remover item \n 3 - Vizualizar carrinho \n 4 - Realizar Pagamento \n 5 - Sair");
       String escolha = scanner.nextLine();
       
switch (escolha){
       case "1":
       System.out.println("Escolha um setor. \n 1 - Massas; \n 2 - Frutas; 3 - Padaria; \n 4 - Eletronicos \n 5 - Limpeza");
       scanner.nextLine();}
       
       switch (){
       case "1":
       System.out.println("Escolha um Produto: ");
       String nome = scanner.nextLine();
       Produto produto1 = new Massas(nome);
       carrinho.add(newMassas);
       break;
       
       case "2":
       System.out.println("Digite o Nome do Produto: ");
       String nome1 = scanner.nextLine();
       Produto produto2 = new Frutas(nome1);
       carrinho.add(newFrutas);
       break;
       
       case "3":
       System.out.println("Digite o Nome do produto: ");
       scanner.nextLine();
       double precoP = Math.random() * 100;
       carrinho.add();
       break;
       
       case "4":
       System.out.println("Digite o Nome do Produto: ");
       string nome = scanner.nextLine();
       Produto produto1 = new Chinelo();
       double precoE = Math.random() * 100;
       carrinho.add(produto1);
       break;
       
       case "5":
       System.out.println("Digite o nome do Produto: ");
       scanner.nextLine();
       double precoL = Math.random() * 100;
       carrinho.add();
       
       
       
   }
   }