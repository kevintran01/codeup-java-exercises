import java.util.Scanner;

class basicCalulator {
    public static void main(String args[]){
        Scanner calculator = new Scanner(System.in);
        double firstNum, secNum, thirdNum, answer;
        System.out.println("Enter First number: ");
        firstNum = calculator.nextDouble();
        System.out.println("Enter second number: ");
        secNum = calculator.nextDouble();
        System.out.println("Enter third number: ");
        thirdNum = calculator.nextDouble();
        answer = firstNum + secNum + thirdNum;
        System.out.println("Your answer is: " + answer);

    }
}
