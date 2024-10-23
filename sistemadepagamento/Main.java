/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadepagamento;

/**
 *
 * @author ISABELADACOSTAMUELLE
 */
public class Main {
    public static void main(String[] args){
        CartaoCredito meuCartao = new CartaoCredito();
        PayPal meuPayPal = new PayPal();
        
        meuCartao.processarPagamento(50.90);
        meuPayPal.processarPagamento(99.90);
        
        System.out.println(meuCartao.obterDetalhes());
        System.out.println(meuPayPal.obterDetalhes());
    }
    
}

