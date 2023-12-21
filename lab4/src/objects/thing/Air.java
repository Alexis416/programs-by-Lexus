package objects.thing;

public class Air extends Thing{
    public Air(String name) {
        super(name);
    }

    @Override
    public void getName() {
        System.out.print("воздух");
    }
}
