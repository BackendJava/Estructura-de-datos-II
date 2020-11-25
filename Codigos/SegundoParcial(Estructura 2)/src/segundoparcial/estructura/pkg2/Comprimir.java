/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.estructura.pkg2;

/**
 *
 * @author Daniel
 */
public class Comprimir {
   
    public String codigoRLE(String text){
        String resultado = new String();
        char[] charArray = text.toCharArray();
        char caracter =0;
        int numero =0;
        int i =0;
        for(char c: charArray){
            if(c!= caracter && i!=0){
                if(numero >=2){
                    resultado += numero;
                    resultado += caracter;
                }else{
                    resultado+=caracter;
                }
                numero = 1;
            }else {
                numero ++;
            }
            caracter = c;
            i++;
            if(numero >=2){
                resultado += numero;
                resultado += caracter;
            }else{
                resultado+= caracter;
            }
        }
        return resultado;
    }
    
    public static String comprimir(String text){
        String resultado = new String();
        char[] charArray = text.toCharArray();
        for(int i = 0; i<charArray.length;i++){
            char s = charArray[i];
            if(!Character.isDigit(s)){
                resultado +=s;
            }else{
                int numero = Integer.parseInt(text);
                for(int j =0; j<numero-1;j++){
                    resultado +=charArray[i+1];
                }
            }
        }
        return resultado;
    }
}

















