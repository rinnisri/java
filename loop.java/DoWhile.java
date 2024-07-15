import java.util.*;
public class DoWhile{
    public static void main(String[]args)
    {
        do{
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
            
        }
        while(n>0);{
        System.out.println(rev); 
        } 
    }
}