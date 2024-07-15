public class Exercise3{
    public static void main(String[] agrs){
        int x,y,z;
        x=y=z=2;
        x+=y;
        y-=z;
        z/=(x+y);
        System.out.println(x+","+y+","+z);
    }
}