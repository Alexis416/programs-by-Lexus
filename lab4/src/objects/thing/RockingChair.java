package objects.thing;

public class RockingChair extends Thing{
    public RockingChair(String name) {
        super(name);
    }

    @Override
    public void getName(){
        System.out.print("кресло-качалку, ");
    }
    public class Strap extends Thing {
        public Strap(String name) {
            super(name);
        }
        @Override
        public void getName(){
            System.out.print("ремнями");
        }
    }
    public class Seat extends Thing {
        public Seat(String name) {
            super(name);
        }

        @Override
        public void getName() {
            System.out.print("сиденью");
        }
    }
}
