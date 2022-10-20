/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetobancodio;

/**
 *
 * @author romar
 */
public class Main {
    public static void main(String[] args) {
        
        Cliente cl1 = new Cliente();
        cl1.setNome("Jose");
        Cliente cl2 = new Cliente();
        cl2.setNome("Ana");
        
        Conta cc = new ContaCorrente(cl1);
        Conta cp = new ContaPoupanca(cl2);
        
        
        cc.depositar(100);
        cc.transferir(50, cp);
        
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
