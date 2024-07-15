import java.util.*;
public class Create{
    public static void main(String[]args){
        int marks[]=new int[100];
        Scanner sc=new Scanner (System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        System.out.println("physics:"+marks[0]);
        System.out.println("chemistry:"+marks[1]);
      /*update the array */
        marks[1]=100;
        System.out.println("chemistry:"+marks[1]);
        /*length of array */
        System.out.println("length of array="+marks.length);
    }
}