/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package al.rededor.de.la.matriz;

import java.util.Scanner;

/**
 *
 * @author perli
 */
public class AlRededorDeLaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lado;
        try ( // TODO code application logic here
                Scanner teclado = new Scanner(System.in)) {
            System.out.print("Introduzca el lado del cuadrado: ");
            lado = teclado.nextInt();
        }
 
        System.out.println();
        for(int row=1; row<=lado; row++){
            for(int col=1; col<=lado; col++){
                if(row==1 || row==lado || col==1 || col==lado){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
