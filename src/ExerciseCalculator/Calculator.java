package ExerciseCalculator;

public class Calculator {

    private double numberOne;
    private double numberTwo;

    public Calculator(double firstNumber, double secondNumber){
        numberOne = firstNumber;
        numberTwo = secondNumber;
    }

    public void add(){
        double sum = numberOne + numberTwo;
        System.out.println("The sum of the numbers is: " + sum);

    }

    public void minus(){
        double Minus = numberOne - numberTwo;
        System.out.println("The difference is: " + Minus);
    }

    public void divide(){
        double Divide = numberOne / numberTwo;
        System.out.println("The divided number is: " + Divide);
    }

    public void multiply(){
        double Multiply = numberOne * numberTwo;
        System.out.println("The multiplied number is: " + Multiply);

    }

    public void modulus(){
        double Modulus = numberOne % numberTwo;
        System.out.println("The modulus of the numbers is: " + Modulus);

    }

}
