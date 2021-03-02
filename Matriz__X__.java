package javapplication2;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author perli
 */
public class Matriz__X__ {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numFilas;
        try ( // TODO code application logic here
                Scanner teclado = new Scanner(System.in)) {
            System.out.print("Introduce el número de filas: "); //Pedir que el usuario que ingrese un numero
            numFilas = teclado.nextInt(); //seguardan el numero que el usuario ingreso
        }
        System.out.println(); //imprimir   
 
        for(int i=1, k=numFilas; i<=numFilas; i++, k--){
            for(int j=1; j<=numFilas; j++){
 
                if(i==j || k==j){
                    System.out.print("*");//espacios que se maraca con un asterisco
                } else {
                    System.out.print(" ");//espacios basios
                }
            }System.out.println();//imprimir
        }
    }    
}
