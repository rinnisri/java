import java.util.*;
public class subarray{
    public static void printSubarrays( int numbers[]){
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            int start=0;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+ " ");
                }
                ts++;
                System.out.println( );
            }
            System.out.println();

        }
        System.out.println("total subarray: "+ts);

    }
    public static void main(String[]args){
        int numbers[]={2,4,6,8,10};
        printSubarrays(numbers);
    }
}