package objects.thing;

public class Cave extends Thing {
    public Cave(String name) {
        super(name);
    }

    @Override
    public void getName() {
        System.out.print("пещеры");
    }
}