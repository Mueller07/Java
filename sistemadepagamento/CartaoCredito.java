/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadepagamento;

/**
 *
 * @author ISABELADACOSTAMUELLE
 */
public class CartaoCredito implements SistemaDePagamento {
    String numeroCartao = "123456";
    int codigoSeguranca = 12345;
  
    
    
   @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento de R$" + valor + " Processado via cartao de credito");
            }
           
            @Override
            public String obterDetalhes(){
                return numeroCartao.substring(numeroCartao.length() - 4);
            }

}
