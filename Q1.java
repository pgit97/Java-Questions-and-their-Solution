//Q1.Define an array of numbers (use any random numbers). 
// Write a program to print only the even numbers of the array. 
// Do not use any library functions, need to do via for loops only
import java.util.*;
class Q1{
    public static void main(String args[]){

        System.out.println("Enter the length of array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        System.out.println("Enter any "+n+ " random number: ");
        for(int i=0;i<A.length;i++){
          A[i] =sc.nextInt(); 
        }
        //    int A[]={10,2,9,8,66,5};
            System.out.println("Even number are: ");
            for(int i=0;i<A.length;i++){
                if(A[i]%2==0){
                    System.out.println(A[i]+" ");
                }
            }
    }
}