/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mitad.de.la.matriz;
import java.util.Scanner;
/**
 *
 * @author perli
 */
public class MitadDeLaMatriz {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner sc = new Scanner(System.in)) {
            System.out.print("Introducir el número de filas: ");//Pedir a usuario que ingrese un numero
            int numFilas = sc.nextInt();//Guardar el numero que el usuario ingreso
            
            for(int i = 1; i<=numFilas; i++){ //aumento de columnas
                for(int j = 0; j<=numFilas-i; j++){ //aumento en filas
                    System.out.print("*");//espacios del numero que el usuario ingreso
                }
                System.out.println("");//espacios basios
            }
        }
    }
}
