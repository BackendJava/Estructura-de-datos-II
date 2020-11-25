/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradocesar;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class CifradoCesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner (System.in);
        Cifrar cifrar_cadena = new Cifrar();
        boolean fin = false;
        String cadena = "";
        int opcion;
        while(!fin){
            System.out.println("\n");
            System.out.println("1. Ingresar la cadena");
            System.out.println("2. Descifrar");
            System.out.println("3. Cifrada");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese la cadena");
                    cadena = teclado.next();
                    cifrar_cadena.cifrar(cadena);
                    break;
                case 2:
                    System.out.println("*******Descifrar*******");
                    System.out.println("Cadena descifrar es: "+ cadena);
                    break;
                case 3:
                    System.out.println("*******Cifrada*******");
                    System.out.println("La cadena cifrada es: "+ cadena);
                    break;
                case 4:
                    fin = true;
                    break;
            }
        }
    }
    
}








