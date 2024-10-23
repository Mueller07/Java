/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadepagamento;

/**
 *
 * @author ISABELADACOSTAMUELLE
 */
public class PayPal implements SistemaDePagamento {
    String email = "isabelammueller00@gmail.com";
  
    
    @Override
    public void 
            processarPagamento(double valor){
                System.out.println("Pagamento de R$" + valor + " Processado via PayPal.");
            }
           
            @Override
            public String obterDetalhes(){
                return"Email associado a conta PayPal: " + email;
            }
}
