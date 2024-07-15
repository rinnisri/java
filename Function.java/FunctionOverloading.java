import java.util.*;
public class FunctionOverloading{
    //sum of 2 number 
    public static int sum(int a,int b)
    {
        return a+b;
    }
    //sum of 3 number 
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String []args){
        System.out.println(sum(3,5));
        System.out.println(sum(5,2,1));

    }
}