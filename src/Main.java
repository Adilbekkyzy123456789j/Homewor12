public class Main {
    public static void main(String[] args) {


        Fish fish = new Fish();
        fish.setName("Ariel");
        fish.setAge(2);
        fish.setColour("blue");
        fish.setMemory(3);

        System.out.println("Fish:");
        System.out.println(fish.getName());
        System.out.println(fish.getAge());
        System.out.println(fish.getColour());
        System.out.println(fish.getMemory());


        Cat cat = new Cat();
        cat.setName("Mimi");
        cat.setAge(4);
        cat.setColour("White");
        cat.setVariety("Русская голубая кошка");


        System.out.println("Cat:");
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getColour());
        System.out.println(cat.getVariety());



        Dog dog=new Dog();
        dog.setName("Rock");
        dog.setAge(5);
        dog.setColour("Black");
        dog.setVariety("Доберман");

        System.out.println("Dog");
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getColour());
        System.out.println(dog.getVariety());


        Parrot parrot=new Parrot();
        parrot.setName("Аква");
        parrot.setAge(1);
        parrot.setColour("yellow");
        parrot.setVariety("Сине-желтый ара");

        System.out.println("Parrot:");
        System.out.println(parrot.getName());
        System.out.println(parrot.getAge());
        System.out.println(parrot.getColour());
        System.out.println(parrot.getVariety());







    }
}
