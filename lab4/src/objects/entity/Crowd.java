package objects.entity;

import enums.Action;

public abstract class Crowd extends Entity {

    public Crowd(String name) {
        super(name);
    }

    public static class Crowd1 extends Crowd {

        public Crowd1(String name) {
            super(name);
        }

        @Override
        public void getName() {
            System.out.print("Фуксии, Селёдочки и профессора Звездочкина");
        }

        @Override
        public void doSomething(Action action) throws InvalidInputException {
            if (action == Action.so_as_not_to_be_exposed) {
                System.out.print("чтобы не подвергаться");
            }else if (action==null) {
                throw new NullException("Введёно пустое значение!");
            } else {
                throw new InvalidInputException("Введён не тот метод!");
            }
        }
    }
    public static class Crowd2 extends Crowd {

        public Crowd2(String name) {
            super(name);
        }

        @Override
        public void getName() {
            System.out.print(" Кантик и Квантик и Альфа с Мемегой ");
        }

        @Override
        public void doSomething(Action action) throws InvalidInputException{
            if (action == Action.set) {
                System.out.print("усадили");
            }else if (action == Action.attached){
                System.out.print("прикрепили");
            }else if (action ==Action.tied_up){
                System.out.print("привязали");
            }else if (action==null) {
                throw new NullException("Введёно пустое значение!");
            } else {
                throw new InvalidInputException("Введён не тот метод!");
            }
        }
    }
    public static class Crowd3 extends Crowd {
        private final String name;

        public Crowd3(String name) {
            super(name);
            this.name = name;
        }

        @Override
        public void doSomething(Action action) throws InvalidInputException{
            if (action == Action.screamed) {
                System.out.print(name + " " + "закричали,");
            }else if (action==null) {
                throw new NullException("Введёно пустое значение!");
            } else {
                throw new InvalidInputException("Введён не тот метод!");
            }
        }
        //Создание экземпляров объектов с помощью локальных классов
        // для их однократного использования с одним действием
        public void doSomethingWithHelpOfSomething1() {
            class Hands {
                public void printDo() {
                    System.out.print(" замахали руками,");
                }
            }
            Hands hands = new Hands();
            hands.printDo();
        }

        public void doSomethingWithHelpOfSomething2() {
            class Palms {
                public void printDo() {
                    System.out.println(" захлопали в ладоши,");
                }
            }
            Palms palms = new Palms();
            palms.printDo();
        }

        public void doSomethingWithHelpOfSomething3() {
            class Hats {
                public void printDo() {
                    System.out.print("стали подбрасывать в воздух шапки. ");
                }
            }
            Hats hats = new Hats();
            hats.printDo();
        }
    }
    public static class Crowd4 extends Crowd {
        private final String name;
        public Crowd4(String name) {
            super(name);
            this.name=name;
        }

        @Override
        public void doSomething(Action action) throws InvalidInputException {
            if (action == Action.jumped) {
                System.out.print(name+" "+"даже"+" "+"прыгали");
            }else if (action==null) {
                throw new NullException("Введёно пустое значение!");
            } else {
                throw new InvalidInputException("Введён не тот метод!");
            }
        }
    }
    public static class Crowd5 extends Crowd {
        private final String name;

        public Crowd5(String name) {
            super(name);
            this.name = name;
        }

        @Override
        public void doSomething(Action action) throws InvalidInputException {
            if (action == Action.cried) {
                System.out.print(name + " " + "плакали");
            }else if (action==null) {
                throw new NullException("Введёно пустое значение!");
            } else {
                throw new InvalidInputException("Введён не тот метод!");
            }
        }
    }
}
