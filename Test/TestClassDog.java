import Ex2.Dog;
import Ex2.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClassDog {
    @Test
    public void testFirstEat() {
        //тествам метода дали когато кучето се храни за първи път, му се повишава теглото
        Dog dog = new Dog();
        dog.eat("fish");
        double expectedDogWeight = 1.05;
        double actualDogWeight = dog.getWeight();
        assertEquals(expectedDogWeight, actualDogWeight);
    }

    @Test
    public void testFirstWalkOut() {
        //тествам метода дали когато кучето се разхожда за първи път, му се намалява теглото
        Dog dog3 = new Dog();
        dog3.walkOut(15);
        double expectedDogWeight = 0.96;
        double actualDogWeight = dog3.getWeight();
        assertEquals(expectedDogWeight, actualDogWeight);
    }
    @Test
    public void testFirstEatNotGainingWeight() {
        //тествам метода дали когато кучето се храни за първи път, но няма храна, НЕ му се повишава теглото
        Dog dog1 = new Dog();
        String testFood = null;
        dog1.eat(testFood);
        double expectedDogWeight = 1;
        double actualDogWeight = dog1.getWeight();
        assertEquals(expectedDogWeight, actualDogWeight);
    }
    @Test
    public void testFirstWalkOutNotGainingWeight() {
        //тествам метода дали когато кучето се разхожда за първи път, му се намалява теглото
        Dog dog4 = new Dog();
        dog4.walkOut(0);
        double expectedDogWeight = 1;
        double actualDogWeight = dog4.getWeight();
        assertEquals(expectedDogWeight, actualDogWeight);
    }

}
