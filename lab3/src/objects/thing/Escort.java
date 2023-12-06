package objects.thing;

public class Escort extends Thing {
    public Escort(String name) {
        super(name);
    }
    @Override
    public void getName() {
        System.out.print("сопровождении");
    }
}

