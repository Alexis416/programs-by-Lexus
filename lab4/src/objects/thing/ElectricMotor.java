package objects.thing;


public class ElectricMotor extends Thing{
    public ElectricMotor(String name) {
        super(name);
    }

    @Override
    public void getName() {
        System.out.print("электродвигателя");
    }
    public class Button extends Thing {
        public Button(String name) {
            super(name);
        }
        @Override
        public void getName() {
            System.out.print("кнопку ");
        }
    }
    public class Propeller extends Thing {
        public Propeller(String name) {
            super(name);
        }

        @Override
        public void getName() {
            System.out.print("пропеллер");
        }
    }
}
