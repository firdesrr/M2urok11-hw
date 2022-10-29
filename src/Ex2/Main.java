package Ex2;

public class Main {
    public static void main(String[] args) {
        Dog dog1=new Dog ();
        Dog dog2=new Dog("Buldog","Sharo",5,7.2);
        System.out.println( dog2);
        dog2.makeSound();
        dog2.eat("bone");
        dog2.walkOut(30);

    }

}