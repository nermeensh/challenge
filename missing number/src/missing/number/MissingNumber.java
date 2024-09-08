/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missing.number;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class MissingNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int arrSize ;
        System.out.println("enter the size of the sequence ");
        Scanner scanner = new Scanner(System.in);
        arrSize=scanner.nextInt();
        int []arr=new int[arrSize];
        System.out.println("enter the sequence ");
        for(int i=0; i<arrSize ;i++){
            arr[i]=scanner.nextInt();
        }
        int sum=0,expSum=0,missing;
        for(int i=1; i<=arrSize+1; i++){
        expSum+=i;
        }
        for(int i=0;i<arrSize;i++){
           sum+=arr[i];
        }
        missing=expSum-sum;
        System.out.println("the missing number is : " + missing);
    
    }
    
}
