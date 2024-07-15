/* 
import java.util.*;
public class StringBuilder{
    public static String stringbuilder(String str,int si,int ei){
        String substr=" ";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);

        }
        return substr;


    }
    */
    public static void main(String[]args){
    StringBuilder sb=new StringBuilder("");
    for(char ch='a';ch<='z';ch++)
    {
        sb.append(ch);
    }
    System.out.println(sb);
}
