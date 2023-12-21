package objects.thing;

public class SpaceSuit extends Thing {
    public SpaceSuit(String name) {
        super(name);
    }

    public void getName(){
        System.out.print("скафандр");
    }
    public class AlpenshtockAndOtherTools extends Thing {
        public AlpenshtockAndOtherTools(String name) {
            super(name);
        }

        @Override
        public void getName() {
            System.out.print("альпенштоки, ледорубы и геологические молотки");
        }
    }
    public class Belt extends Thing {
        public Belt(String name) {
            super(name);
        }

        @Override
        public void getName() {
            System.out.print("поясам ");
        }
    }
}
