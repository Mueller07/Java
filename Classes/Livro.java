/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ISABELADACOSTAMUELLE
 */
public class Livro {
    String titulo;
    String autor;
    int pagina; 
    
    public Livro (String titulo, String autor, int pagina){
    this.titulo = titulo;
    this.autor = autor;
    this.pagina = pagina;
    }
    
    public void lancamento(){
        System.out.println("Titulo: " + titulo + "\n Autor: " + autor + "\nQuantidade de paginas: " );
    }
}
    
