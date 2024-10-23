/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ISABELADACOSTAMUELLE
 */

public class Aluno {
    String nome;
    int matricula;
    String curso;
  
    public Aluno(String nome, int matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public void boletim(){
        System.out.println("Nome: " + nome + "\n matricula: " + matricula + "\n curso: " + curso);
    }
    
}
