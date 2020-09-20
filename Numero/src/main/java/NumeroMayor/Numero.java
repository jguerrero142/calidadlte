/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumeroMayor;

/**
 *
 * @author Julian Guerrero
 */
public class Numero extends Index {
    
    int NumeroM;
    
    public Numero (int primer_numero,int segundo_numero,int NuM)
    {
        super(primer_numero,segundo_numero);
        if (primer_numero > segundo_numero){
            
        NuM = primer_numero;
        
        } else {
        
            NuM=segundo_numero;
        }
        
        
}
    public void imprimirNum()
    {
     System.out.println("El primer numero es: "+Numero1);
     System.out.println("El segundo numero es: "+Numero2);
     System.out.println("El numero mayor es: "+NumeroM);
    
    }
}
