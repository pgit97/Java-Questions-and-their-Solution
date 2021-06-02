//Q2.Find the maximum consecutive 1's in an array of 0's and 1's.
import java.util.*;
class Q2{
    public static void main(String args[]){
        int A[]={1,1,1,0,0,1,1,1,1,1,1,0,0};
        int temp=0;
        int result=0;
        // System.out.println("Even number are: ");
        for(int i=0;i<A.length;i++){
            if(A[i]==0){
                temp=0;
            }
            else{
                temp++;
            }
            if(temp>result){  
                result=temp;
                }

        }
        System.out.println(result);
    }
}
