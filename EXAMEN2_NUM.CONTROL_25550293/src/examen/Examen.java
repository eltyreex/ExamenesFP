/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
         System.out.println("DAME UN NUMERO");
        int numero;
        Scanner input = new Scanner(System.in);
        numero = input.nextInt(); 
        
        System.out.println("quieres imprir los no primos (1) o los primos (2)");
        int eleccion = input.nextInt();
        String valor = "**" ;
       
     
         if(eleccion == 1){
            for(int i = 2; i<=numero; i ++){
                if(i % 2 ==0){
                    System.out.println(i);
                    System.out.println(valor);
                    valor+="*" + "*";
                }//listo siiii
                
            }
            
            
         }else if(eleccion ==2){
            for(int i = 2; i<numero; i ++){
                 boolean primo = true;
            for(int j = 2; j < i; j++) {
            if(i % j == 0) {
            primo = false;
            break;
            }
} 
            if(primo) {
            System.out.print(i + " ");
    }
                valor+="*";
                
                }
              
                
                }
               
         //hasta aqui me quede porfavor q valga algo :c
            }
    
        } 
   