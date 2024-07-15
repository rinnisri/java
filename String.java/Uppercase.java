import java.util.*;
public class Uppercase{
    public static String touppercase(String[]str){
        StringBuilder sb=new StringBuilder("");
        char ch=character.touppercase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==''&&i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(character.touppercase(str.charAt(i)));

            }

            else{
                sb.append(str.charAt(i));
            }
            

        }

    
    return sb.tostring();
}
public static void main(String[]args){
    String str="hii kritika";
}
}
