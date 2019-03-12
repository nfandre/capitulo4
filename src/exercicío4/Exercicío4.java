/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicío4;

import java.util.Scanner;

/**
 *
 * @author André
 */
public class Exercicío4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        criptografia c = new criptografia();
        int numero;
        System.out.println("Programa de criptografia");
        System.out.println("Informe o numero de 4 digitos a ser criptografado: ");
        numero = sc.nextInt();
        
        System.out.println(c.criptografar(numero));
       // System.out.println(c.descriptografar(numero));
        
    }
    
}
