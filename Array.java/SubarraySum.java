import java.util.*;
public class SubarraySum{
    public static void maxsum(int numbers[]){
        int currSum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=0;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(maxsum<currSum){
                    maxsum=currSum;
                }
            }
        }

        System.out.println("maxsum=" +maxsum);
    }
    public static void main(String[]args){
        int numbers[]={2,4,6,8,10};
        maxsum(numbers);
    }
}