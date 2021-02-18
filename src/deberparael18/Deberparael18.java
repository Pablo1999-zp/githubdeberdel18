/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberparael18;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Deberparael18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("BIENVENIDO A MI PROGRAMA");
        System.out.println("ELIJA LA OPCION ");
        System.out.println("1.TRES NUMEROS DE MENOR A MAYOR");
        System.out.println("2.NUMERO DE CINCO CIFRAS AL REVEZ");
        int opcion = lector.nextInt();
       
        
        
    
        switch (opcion) {
        
        case 1: 
        tresnumeros tn=new tresnumeros();
        tn.condiciones(); 
        break;
        
        case 2:
        NumerosAlrevez na=new NumerosAlrevez();
        na.nAlrevez();
        break;
        
        default: 
        System.out.println("OPCION INCORRECTA");
    
    }
    
    

}
}
