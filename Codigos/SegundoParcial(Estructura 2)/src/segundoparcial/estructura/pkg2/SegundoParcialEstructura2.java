/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.estructura.pkg2;

import java.util.Scanner;
import static segundoparcial.estructura.pkg2.Comprimir.comprimir;

/**
 *
 * @author Daniel
 */
public class SegundoParcialEstructura2 {

    private static boolean comprimir;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner entrada = new Scanner(System.in);
     String palabra;
     boolean fin = false;
     int opcion;
     while(!fin){
            System.out.println("\n");
            System.out.println("1. Comprimir Cadena");
            System.out.println("2. Descomprimir Cadena");
            System.out.println("9. Salir");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("----Comprimir Cadena----");
                    System.out.println("Ingrese la palabra");
                    palabra = entrada.next();
                    System.out.println(Comprimir.comprimir(palabra));
                    break;
                case 2:
                    System.out.println("----Descomprimir Cadena----");
                    System.out.println("Ingrese la palabra");
                    break;
                case 3:
                    fin = true;
                    break;
            }
        }
     
    }
}













