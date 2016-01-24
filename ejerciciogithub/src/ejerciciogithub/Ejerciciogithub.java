/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciogithub;

/**
 *
 * @author Alberto
 */
public class Ejerciciogithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][]=new int [10][10];
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++)
                matriz[i][j]=2;
        }
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++)
                System.out.print(matriz[i][j]+" ");
            System.out.println("");
        }   
    }
    
}
