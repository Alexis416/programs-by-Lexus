package objects.thing;

public class Rocket extends Thing {
    public Rocket(String name) {
        super(name);
    }
    @Override
    public void getName(){
        System.out.print("ракету");
    }
}
