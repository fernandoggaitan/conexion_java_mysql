/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import vistas.Tareas_listar_vista;

/**
 *
 * @author Fernando
 */
public class Principal {

    public static void main(String[] args) {
        
         Tareas_listar_vista vista = new Tareas_listar_vista();
         vista.setVisible(true);
         vista.setLocationRelativeTo(null);
         
    }

}