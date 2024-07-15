
import java.util.*;
public class JavaBasic{
    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[]args){
        int a=4;
        int b=5;
        int prod=multiply(a,b);
        System.out.println("a * b:"+prod);
        prod=multiply(10,30);
        System.out.println("a * b:"+prod);
    }
}