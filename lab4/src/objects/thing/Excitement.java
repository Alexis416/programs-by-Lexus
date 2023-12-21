package objects.thing;

public class Excitement extends Thing{
    public Excitement(String name) {
        super(name);
    }

    @Override
    public void getName() {
        System.out.print("возбуждения");
    }
}
