/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg25550293_exa1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tiempo1,tiempo2,tiempo3,tiempot;
        System.out.println("Vengo a capturar");
        Scanner input = new Scanner (System.in);
        System.out.println("Tiempo prueba 1");
        tiempo1 = input.nextDouble();
        System.out.println("tiempo prueba 2");
        tiempo2 = input.nextDouble();
        System.out.println("tiempo prueba 3");
        tiempo3 = input.nextDouble();
        
        tiempot= tiempo1 +tiempo2 + tiempo3;
        
        if(tiempot<120 && tiempo1<=60 && tiempo2<=60 && tiempo3<=60){
            System.out.println("Clsificacion excelente");
        } else if(tiempot <150 || tiempo1<=70 || tiempo2<=70 || tiempo3<=70){
            System.out.println("casificacion buena");
        }else{
            System.out.println("Clasificacio regular");
        }
        
    }
    
}
