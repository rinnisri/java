import java.util.*;
public class substring{
    public static String substring(String str,int si,int ei){
        String substr=" ";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);

        }
        return substr;


    }
    public static void main(String[]args){
        /*print a substring */
       // String str="HelloWorld";
       // System.out.println(substring(str,0,7));
       /*print a largest string  */
       String fruits[]={"apple","mango","banana"};
       String largest =fruits[0];
       for(int i=1;i<fruits.length;i++){
        if(largest.compareTo(fruits[i])<0)
        {
            largest=fruits[i];
        }
       }
       System.out.println(largest);
    }
}