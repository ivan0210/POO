/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrito;

/**
 *
 * @author Windows7
 */
public class Carrito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Molde carrito1=new Molde();
        carrito1.color="aqua blue";
        System.out.println("El color es: " + carrito1.color);
        carrito1.modelo="Black Hole";
        System.out.println("El modelo es: " + carrito1.modelo);
        carrito1.transmision="Estandar";
        System.out.println("La transmision del auto es: " + carrito1.transmision);
        
    }
    
}
