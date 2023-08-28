import java.util.Scanner;

public class PowerComputingMain {
    public static void main(String[] args) {
        Numeric testOne = new Numeric();
        Scanner scanner = new Scanner(System.in);

        double valueOfX = scanner.nextDouble();
        int valueOfN = scanner.nextInt();
        
        double testOneResult = testOne.intPower(valueOfX, valueOfN);
        System.out.println(testOneResult);
    }

    
}
