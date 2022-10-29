package Ex2;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Buldog", "Sharo", 5, 7.2);
        System.out.println(dog1);
        dog1.makeSound();
        dog1.eat("dog pellets");
        System.out.println("dog " + dog1.getName() + " new weight is: " + dog1.getWeight());
        dog1.walkOut(45);
        System.out.println("dog " + dog1.getName() + " new weight is: " + dog1.getWeight());

        System.out.println();
        System.out.println(dog2);
        dog2.makeSound();
        dog2.eat("bone");
        System.out.println("dog " + dog2.getName() + " new weight is: " + dog2.getWeight());
        dog2.walkOut(30);
        System.out.println("dog " + dog2.getName() + " new weight is: " + dog2.getWeight());
    }


}