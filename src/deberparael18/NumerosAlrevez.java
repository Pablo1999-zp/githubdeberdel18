/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberparael18;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NumerosAlrevez {
    
    public void nAlrevez (){
        
        Scanner lector = new Scanner(System.in);

        int A , C1,C2,C3,C4,C5;

        String c1,c2,c3,c4,c5;
        System.out.println("Ingerese un numero de 5 cifras :");
        A= lector.nextInt();


 C5=  A % 10;

 C4 = A %100 /10;

 C3 = A %1000/100;

 C2 = A %10000/1000;

 C1 = A %100000/10000;


c1 = String.valueOf(C1);
c2 = String.valueOf(C2);
c3 = String.valueOf(C3);
c4 = String.valueOf(C4);
c5 = String.valueOf(C5);

System.out.println(c5+c4+c3+c2+c1);
}
        
    }


