package africa.tutored.chaptertwoClass;

public class Calculator {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {

        int product = firstNumber * secondNumber;
        return product;
    }

    public float subtract(float firstNumber, float secondNumber) {
        float difference;
        if (firstNumber > secondNumber){
            difference = firstNumber - secondNumber;
        }
        else{
            difference = secondNumber - firstNumber;
        }
        return difference;
    }

    public float divide(double dividend, double divisor) {
        if (divisor == 0){
            return 0.0F;
        }
        else {
            return (float) (dividend/divisor);
        }
    }
}
