/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetobancodio;

import java.util.List;
import lombok.Data;

/**
 *
 * @author romar
 */
@Data
public class Banco {
    
    private String nome;
    private List<Cliente> clientes;
    
}
