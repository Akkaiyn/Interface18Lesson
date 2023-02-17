package Task;

public class Main {
    public static void main(String[] args) {

        Flayable eagle = new Eagle();
        Flayable parrot = new Parrot();
        Flayable bee = new Bee();
        Flayable airplane = new Airplane();
        Flayable aerostat = new Aerostat();
        Flayable helicopter = new Helicopter();

        Flayable [] f = {eagle, parrot, bee, airplane, aerostat, helicopter};
        for (Flayable bt :
                f) {
            bt.fly();
        }

        Flayable [] zoo = {eagle,parrot, bee};
        Flayable [] hangor = {helicopter, aerostat,airplane};
    }
}
