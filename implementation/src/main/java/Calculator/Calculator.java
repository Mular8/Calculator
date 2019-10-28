package Calculator;


import java.util.Scanner;

public class Calculator implements ICalculator {


    public void run() {
        double result = 0;
        Scanner myObj = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe: ");
        Double firstNumber = Double.parseDouble(myObj.nextLine());

        System.out.println("Podaj działanie: ");
        String action = myObj.nextLine();  // Read user input

        System.out.println("Podaj druga liczbe: ");
        Double secondNumber = Double.parseDouble(myObj.nextLine());

        switch(action) {

            case "+":
                result = add(firstNumber, secondNumber);
                break;

            case "-":
                result = subtract(firstNumber, secondNumber);
                break;

            case "*":
                result = multiply(firstNumber, secondNumber);
                break;

            case "/":
                result = divide(firstNumber, secondNumber);
                break;
        }

        System.out.println("Wynik = " + result);
    }

    @Override
    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public  double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}
