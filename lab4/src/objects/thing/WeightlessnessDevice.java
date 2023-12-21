package objects.thing;

public class WeightlessnessDevice extends Thing{
    public WeightlessnessDevice(String name) {
        super(name);
    }

    @Override
    public void getName() {
        System.out.print(" прибор невесомости");
    }
}
