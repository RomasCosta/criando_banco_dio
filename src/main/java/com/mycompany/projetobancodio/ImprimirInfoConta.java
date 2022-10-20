/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetobancodio;

/**
 *
 * @author romar
 */
public class ImprimirInfoConta extends Conta {

    public ImprimirInfoConta(Cliente cliente) {
        super(cliente);
    }
    
    public void imprimirExtrato() {
        System.out.println(String.format("Agencia: %d", super.getAgencia()));
        System.out.println(String.format("Numero: %d", super.getNumero()));
        System.out.println(String.format("Saldo: %2f", super.getSaldo()));
    }
    
}
