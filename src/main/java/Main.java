import entity.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat", "Siberian", 15, 4);
        System.out.println(animal);
        System.out.println(animal.getName());

    }
}
