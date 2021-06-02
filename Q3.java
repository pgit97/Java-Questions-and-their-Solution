//Q3.
import java.util.*;
class Q3{
    public static void main(String args[]){

        System.out.println("Enter the length of an array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        System.out.println("Enter any random number: ");
        for(int i=0;i<A.length;i++){
          A[i] =sc.nextInt(); 
        }
        //    int A[]={10,2,9,8,66,5};
            System.out.println("Repeated digit is:  ");
            for(int i=0;i<A.length;i++){
                for(int j=i+1;j<A.length;j++){
                if(A[i]==A[j]){
                    System.out.println(A[i]);
                }
            }
        }
    }
}