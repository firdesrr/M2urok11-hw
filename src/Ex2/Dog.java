package Ex2;

public class Dog {
    private String breed;
    private String name;
    private int age;
    private double weight; //kg

    /*
    Добавете поне по 2 тестови сценария към методите
    eat(), walkOut() и тествайте метода makeSound().*/
    public static void makeSound() {
        System.out.println( "Dog makes sound \"Bau Bau!\"");
    }

    public  void  eat(String food) {
        if (food!=null) {
            System.out.println(" dog " +this.name+" is eating food: " + food);
            this.weight += 0.05;
        }
        else {
            System.out.println( "dog " +this.name+ "  isn't eating...");
        }
    }

    public  void walkOut(int time) {
        if(time>0) {
            System.out.println(this.name + " is walking " + time + " minutes");
            this.weight -= 0.04;
        } else {
            System.out.println( "dog " +this.name+ "  isn't walking...");
        }
    }

    public Dog() {
        this.breed = "Dakel";
        this.name = "Dako";
        this.age = 1;
        this.weight = 1;
    }

    public Dog(String breed, String name, int age, double weight) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed: '" + breed + '\'' +
                ", name: '" + name + '\'' +
                ", age: " + age +
                ", weight: " + weight +
                '}';
    }
}
