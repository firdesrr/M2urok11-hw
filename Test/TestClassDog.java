import Ex2.Dog;
import Ex2.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClassDog {
    @Test
public void testFirstEat(String testFood){
        //тествам метода дали когато кучето се храни за първи път, му се повишава теглото
Dog dog1=new Dog();
        Main.dog1.eat(testFood);
        double expectedDogWeight=1.05;
        double actualDogWeight=dog1.getWeight()+0.05;
        assertEquals(expectedDogWeight,actualDogWeight);

    }


}
