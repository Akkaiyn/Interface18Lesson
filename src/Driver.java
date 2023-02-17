public class Driver extends  Person  implements Walkable, Leanable{
    @Override
    public void walk(){
        System.out.println("Driver walking to the home");

    }
    @Override
    public void learn(){
        System.out.println("Driver learning how to drive");
    }
}
