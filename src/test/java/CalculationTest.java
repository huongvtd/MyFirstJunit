import org.junit.jupiter.api.*;

public class CalculationTest {
    private CalculationDemo calculationDemo;

    @BeforeAll
    public static void setupClass () {
        System.out.println("Set up Class");
    }

    @BeforeEach
    public void setup (){
        calculationDemo = new CalculationDemo();
        System.out.println("Set up Test");
    }

    public static double [][] data(){
               return new double[][] {{1,2,3}, {2,3,4}, {1.2,1.3,2.5}};
    }

    @ParameterizedTest
    @MethodSource (value = "data")
    public void addTest(double[] data) {
        Assertions.assertEquals(data[2], CalculationDemo.add(data[0],data[1]), "Addition is incorrect");
    }

    @Test
    public void multiplyTest (){
        double result = CalculationDemo.multiply(3.5,1);
        Assertions.assertEquals(3.5, result, "Multiplication is not exact");
    }

    @AfterEach
    public void teardown  () {
        System.out.println("Tear down test");
    }

    @AfterAll
    public static void teardownClass (){
        System.out.println("Tear down Class");
    }
}
