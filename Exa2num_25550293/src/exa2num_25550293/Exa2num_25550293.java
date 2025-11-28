/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exa2num_25550293;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Exa2num_25550293 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("DAME UN NUMERO");
        int numero;
        Scanner input = new Scanner(System.in);
        numero = input.nextInt();
        System.out.println("quieres imprimir los primos (1) o no primos (2)");
        int eleccion = input.nextInt();
        boolean primo=true;
        if(eleccion == 1){
            for(int i = 2; i<numero; i ++){
                if(numero % i ==0){
                    primo = false;
                }
                if(primo = false);{
                for(int f =0; f< numero; f ++){
                    System.out.println();
                }
            }
            }
        }
       
    }
    
}
