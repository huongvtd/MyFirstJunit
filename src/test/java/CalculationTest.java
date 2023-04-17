import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculationTest {
    @Test
    public void addTest() {
        CalculationDemo calculationDemo = new CalculationDemo();
        double result = CalculationDemo.add(1.7, 8.3);
        Assertions.assertEquals(10.2, result, "Addition is incorrect");
    }

    @Test
    public void multiplyTest (){
        CalculationDemo calculationDemo = new CalculationDemo();
        double result = CalculationDemo.multiply(3.5,1);
        Assertions.assertEquals(3.5, result, "Multiplication is not exact");
    }
}
