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
public class  tresnumeros {
   int n1,n2,n3;
    Scanner lector = new Scanner(System.in);

   public void condiciones (){
       System.out.println("ESCRIBA EL PRIMER NUMERO");
       n1= lector.nextInt();
       System.out.println("ESCRIBA EL SEGUNDO NUMERO");
       n2=lector.nextInt();
       System.out.println("ESCRIBA EL TERCER NUMERO");
       n3 =lector.nextInt();
       //n1 =Integer.parseInt(JOptionPane.showInputDialog("ESCRIBA EL PRIMER NUMERO"));
       // n2 =Integer.parseInt(JOptionPane.showInputDialog("ESCRIBA EL PRIMER NUMERO"));
        //n3 =Integer.parseInt(JOptionPane.showInputDialog("ESCRIBA EL PRIMER NUMERO"));
        
        if((n1<n2)&& (n2<n3)){
            //JOptionPane.showMessageDialog null
            System.out.println("ORDEN:" +n1+ " - " +n2+ " - " +n3 );
        }
        else if ((n1<n3)&&(n3<n2)){
            System.out.println("ORDEN:" +n1+ " - " +n3+ " - " +n2 );
            
        }
         
        else if ((n2<n1)&&(n1<n3)){
            System.out.println("ORDEN:" +n2+ " - " +n3+ " - " +n1 );
            
        }
        else if ((n2<n3)&&(n3<n1)){
            System.out.println("ORDEN:" +n2+ " - " +n3+ " - " +n1 );
            
        }
        else if ((n3<n1)&&(n1<n2)){
            System.out.println("ORDEN:" +n3+ " - " +n2+ " - " +n1 );
            
        }
        else {
            System.out.println("ORDEN:" +n3+ " - " +n2+ " - " +n1 );
            
        
   }
  // Scanner lector = new Scanner(System.in);
   
        }
    
   
}
