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
public class Index {
    
    int Numero1;
    int Numero2;
    
    public Index (int primer_numero, int segundo_numero)
    {
    
        Numero1=primer_numero;
        Numero2=segundo_numero;
    }
    
    public void imprimir()
    {
    System.out.println("Numero 1 es : "+Numero1);
    System.out.println("numero 2 es : "+Numero2);
    }
    
}
