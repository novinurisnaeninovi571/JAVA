/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo2.input;
import java.util.Scanner;

/**
 *
 * @author  novi nurisnaeni
 */
public class latihanpbo2input {
    /**
     * @param args  the command line arguments
     * 
     */
    public static void main(String[] args){
         System.out.print("Masukan nama  anda: ");
        Scanner Scanner = new Scanner (System.in);
        
        String nama  = Scanner.next();
        System.out.println ("Nama anda adalah :  "+ nama  );
        
    }
    
}
