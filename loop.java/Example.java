//keep entering number till user enter a  multiple of 10;
import java.util.*;
public class Example {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("enter a number");
            int n=sc.nextInt();
            if(n%10==0)
            {
                break;
            }
            System.out.println(n);

        }
        while(true);
    }
}
/*public class basic
 * {
 * public static void main(String[]args)
 * {
 * Scanner sc=new Scanner(System.in);
 * do{
 * Syso("enter a number ");
 * int n=sc.nextInt();
 * if(n%10==0){
 * break;
 * }
 * Syso(n);
 * }
 * while(true);
 * }
 * }
 */