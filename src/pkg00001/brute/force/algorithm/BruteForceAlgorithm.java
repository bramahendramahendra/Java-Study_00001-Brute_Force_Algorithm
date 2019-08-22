/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00001.brute.force.algorithm;

/**
 *
 * @author Brama Hendra Mahendra
 */

import java.util.Scanner;
public class BruteForceAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String text,pattern;
        System.out.println("Enter Text");
        text=src.nextLine();
        System.out.println("Enter Pattern");
        pattern=src.nextLine();
        BruteForce obj=new BruteForce(text,pattern);
        int z=obj.bruteForceMatch( );
        if(z!=-1)
                System.out.println(pattern+" is present in "+text+" from index "+z+" to "+ (z+pattern.length()-1));
        else
                System.out.println(pattern +" is not present in "+text);
          System.out.println(" No of comparsions = "+ obj.getNoOfComparisons( ));
        }
}
