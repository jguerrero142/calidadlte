/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumeroMayor;

import java.util.Scanner;

/**
 *
 * @author Julian Guerrero
 */
public class proces {
    
    public static void main(String[] args){
        
        Scanner lector = new Scanner (System.in);
        
        int n;
        
        System.out.println("Ingrese un numero");
        n = lector.nextInt();
        
        if (n > 0){
        
            for(int i = 1;i <= 10;i++){
            
                System.out.println(n+ "por "+i+" Es igual a"+n*i);
            }
        } else {
             
            System.out.println("el numero no es correcto");
        }
        
    }
    
}
