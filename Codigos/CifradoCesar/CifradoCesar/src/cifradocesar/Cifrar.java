/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradocesar;

/**
 *
 * @author Daniel
 */
public class Cifrar {
    private String abecedario =" abcdefghijklmnñopqrstuvwxyz", cadena = "";
 

   public String cifrar(int clave,String cadena_original){
       cadena = "";
       int posicion;
       for(int i=0; i<cadena_original.length();i++){
           posicion = Posicion(cadena_original.charAt(i));//encontramos la posicion del caracter
           posicion = (posicion+clave)%27;
           cadena+=abecedario.charAt(posicion);
       }
     return cadena;  
   }
   
   public String decifrar(int clave,String cadena_original){
       cadena="";
       int posicion;
       for(int i=0; i<cadena_original.length();i++){
           posicion = Posicion(cadena_original.charAt(i));//encontramos la posicion del caracter
           posicion = (posicion-clave)%27;
           cadena+=abecedario.charAt(posicion);
       }
       
       return cadena;
   }
   
   private int Posicion(char caracter){
       int conta = -1;
       for(int i=0;i<abecedario.length();i++){
           if(abecedario.charAt(i) == caracter){
               conta = i;
               break;
           }
       }
       return conta;
   }

    public String getAbecedario() {
        return abecedario;
    }

    public void setAbecedario(String abecedario) {
        this.abecedario = abecedario;
    }

}





