/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arrSize ;
        System.out.println("enter the size of the sequence ");
        Scanner scanner = new Scanner(System.in);
        arrSize=scanner.nextInt();
        int []arr=new int[arrSize];
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<arrSize ;i++){
            arr[i]=arr[i-2]+arr[i-1];
        }
        for(int i=0; i<arrSize ;i++){
            System.out.println(arr[i] + "\n");
        }
        
        
        
    }
    
}
