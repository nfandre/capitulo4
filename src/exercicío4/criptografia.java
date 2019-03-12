/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicío4;


/**
 *
 * @author André
 */
public class criptografia {
    
    int numero;
    
    public int criptografar(int numero){
        String resultado = "";
        char[] caracteres = String.valueOf(numero).toCharArray();
        int vetorNumero[] = new int[caracteres.length];
        int i=0;
        for(char caractere: caracteres){
            vetorNumero[i]= Character.getNumericValue(caractere);
            vetorNumero[i]=(vetorNumero[i]+7);
            System.out.print(vetorNumero[i]);
            i++;
        }
        int aux;
        aux = vetorNumero[0];
        vetorNumero[0] = vetorNumero[2];
        vetorNumero[2] = aux;
        aux = vetorNumero[1];
        vetorNumero[1] = vetorNumero[3];
        vetorNumero[3] = aux;
        for(int vn: vetorNumero){
            System.out.println(vn);
            resultado=resultado+""+ vn;
        }
        return Integer.parseInt(resultado);
    }
    /*public int descriptografar(int numero){
        
      
    }*/
}
