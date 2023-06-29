/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("Maria Soledad Perez",23);
        Persona p2 = new Persona("Marco Arturo Picoita",20);
        ArrayList<Persona> lista = new ArrayList();
        
        System.out.printf("%s\n",p1.obtenerEdad());
        System.out.printf("%s\n",p2.obtenerEdad());
        
        lista.add(p1);
        lista.add(p2);
        
        double prom = p1.promedioEdades(lista);
        System.out.printf("%.2f\n",prom);
    }
}
