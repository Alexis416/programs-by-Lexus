package objects.thing;

public class Buzzing extends Thing{
    public Buzzing(String name) {
        super(name);
    }

    @Override
    public void getName() {
        System.out.print("жужжание");
    }
}
