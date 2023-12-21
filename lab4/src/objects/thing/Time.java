package objects.thing;

public class Time extends Thing{
    public Time(String name) {
        super(name);
    }

    @Override
    public void getName() {
        System.out.print("время");
    }
}
