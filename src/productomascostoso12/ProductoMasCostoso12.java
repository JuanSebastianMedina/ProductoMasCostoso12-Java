/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productomascostoso12;
/**
 * @author juanse
 * fecha: sabado 06 de septiembre de 2025
 * requerimientos: Solicita al usuario cuántos productos comprará. 
 * Por cada producto, pide nombre y precio.
 * Al final, muestra cuál fue el producto más caro y su precio. 
 * Hazlo usando for para recorrer y comparar.
 */
import javax.swing.JOptionPane;
public class ProductoMasCostoso12 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ENTRADAS, PROCESOS 
        int cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos productos desea comprar?"));
        String nombreMayor = null; 
        int precioMayor = 0;
        for (int i=0; i<cantidadProductos; i++ ) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto # " + i);
            int precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio de " + nombre));
            if (precio > precioMayor) {
                precioMayor = precio;
                nombreMayor = nombre;
            } else {
            }
        }
        // SALIDAS
        JOptionPane.showMessageDialog(null, "El producto más costoso es: \n " + nombreMayor + " y vale " + precioMayor);
    }
}
