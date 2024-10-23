/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadepagamento;

/**
 *
 * @author ISABELADACOSTAMUELLE
 */
public interface SistemaDePagamento {
    void processarPagamento(double valor);
    String obterDetalhes(); 
}

