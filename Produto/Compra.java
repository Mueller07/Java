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
    ArrayList<Produto> carrinho = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    boolean start = false;
  public void start(){  
while(!start){
    System.out.println("------ menu de compras -----------");
    System.out.println("1- Adicionar no carrinho");
    System.out.println("2- Remover do carrino");
    System.out.println("3- Detalhes do carrinho");
    System.out.println("4- Finalizar a compra");
    System.out.println("5- Sair");

    int sistema = scanner.nextInt();

switch (sistema) {
    case 1:
        System.out.println("Escolha a categoria/tipo");
        System.out.println("1- Melancia");
        System.out.println("2- Miojo");
        System.out.println("3- Sabão em pó");
        System.out.println("4- Celular");
        System.out.println("5- Pão");
        
        int escolha = scanner.nextInt();
                    
switch (escolha) {
    case 1:
        Fruta newFruta = new Fruta();
        carrinho.add(newFruta);
        System.out.println("Melancia adicionado ao carrinho");
        break;
    case 2:
        Massas newMassas = new Massas();
        carrinho.add(newMassas);
        System.out.println("Miojo adicionado ao carrinho");
        break;
    case 3:
        Limpeza newLimpeza = new Limpeza();
        carrinho.add(newLimpeza);
        System.out.println("Sabão em Pó adicionado ao carrinho");
        break;
    case 4:
        Eletronicos newEletronicos = new Eletronicos();
        carrinho.add(newEletronicos);
        System.out.println("Celular adicionado ao carrinho");
        break;
    case 5:
        Padaria newPadaria = new Padaria();
        carrinho.add(newPadaria);
        System.out.println("Pão adicionado ao carrinho");
        break;
}
        break;
    case 2:
        System.out.println("Escolha a categoria/tipo");
        System.out.println("1- Melancia");
        System.out.println("2- Miojo");
        System.out.println("3- Sabão em Pó");
        System.out.println("4- Celular");
        System.out.println("5- Pão");
        for (int i = 0; i < carrinho.size(); i++) {
        System.out.println((i + 1) + carrinho.get(i).nome + "" + "R$" + "" + carrinho.get(i).preco);
    }

        System.out.println("Escolha o que voce deseja remover do carrinho");
        int i = scanner.nextInt();
        carrinho.remove(i - 1);
        break;

    case 3:
        System.out.println(carrinho);
        double valorTotal = 0;
        for (int ii = 0; ii < carrinho.size(); ii++) {
            valorTotal += carrinho.get(ii).preco;
  }
        System.out.println("Valor total do carrinho: " + valorTotal);
        break;
    case 4:
        System.out.println("Voce concluiu a sua compra");
        carrinho.clear();
        break;
    default:
            }       
    }

}
}
