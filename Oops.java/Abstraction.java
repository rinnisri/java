abstract class car{
    abstract public void fueltype();
    public void color(){
        System.out.println("black color");
    } 
}
class tata extends car{
    public void fueltype(){
        System.out.println("diesel");
    }
}


public static void main(String[]args){
    tata nexon=new tata();
    nexon.fueltype();
    nexon.color();

}


