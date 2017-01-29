/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1problema3;
import java.util.Scanner;

/**
 *
 * @author danii
 */
public class Tarea1problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    
    double X1,X2,Y1,Y2,DIS;
        System.out.println("Punto 1");
        System.out.print("X1= ");
        X1 = key.nextDouble();
        System.out.print("Y1= ");
        Y1 = key.nextDouble();
        System.out.println("Punto2");
        System.out.print("X2= ");
        X2 = key.nextDouble();
        System.out.print("Y2= ");
        Y2 = key.nextDouble();
        
        DIS = Math.pow(X1-X2, 2)+Math.pow(Y1-Y2, 2);
        DIS=Math.sqrt(DIS);
        
        System.out.println("La distancia es: "+DIS);
    }
    
}
