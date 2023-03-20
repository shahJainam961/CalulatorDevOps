package org.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

class CalculatorOperations{
    private static final Logger logger = LogManager.getLogger(CalculatorOperations.class);

    public double add(double a, double b){
        double ans = a + b;
        logger.info(" - [ADDITION] of "+a+" AND "+b+" - [RESULT] : "+ ans);
        return ans;
    }

    public double subtract(double a, double b){
        double ans = a - b;
        logger.info(" - [SUBTRACTION] of "+a+" AND "+b+" - [RESULT] : "+ ans);
        return ans;
    }

    public double multiply(double a, double b){
        double ans = a * b;
        logger.info(" - [MULTIPLICATION] of "+a+" AND "+b+" - [RESULT] : "+ ans);
        return ans;
    }

    public double divide(double a, double b){
        double ans = a / b;
        logger.info(" - [DIVISION] of "+a+" AND "+b+" - [RESULT] : "+ ans);
        return ans;
    }

    public double power(double a,double b){
        double ans = Math.pow(a,b);
        logger.info(" - [POWER] of "+a+" AND "+b+" - [RESULT] : "+ ans);
        return ans;
    }

    public double naturalLog(double n){
        double ans = Math.log(n);
        logger.info(" - [NATURAL LOG] of "+n+" - [RESULT] : "+ ans);
        return ans;
    }

    public double factorial(int n){

        if(n<0) {
            return Double.NaN;
        }

        long ans = 1;
        while(n > 0){
            ans = ans*n;
            n--;
        }
        logger.info(" - [FACTORIAL] of "+n+" - [RESULT] : "+ ans);
        return ans;
    }

    public double squareRoot(double a){
        double ans = Math.sqrt(a);
        logger.info(" - [SQUARE] ROOT of "+a+" - [RESULT] : "+ ans);
        return ans;
    }

}

public class Calculator {

    public void runService() {
        Scanner scanner = new Scanner(System.in);
        CalculatorOperations calcOp = new CalculatorOperations();

        Integer op;
        double num1=0, num2=0;
        int ni=0;
//        scanner.next().charAt(0);
        System.out.println("======================================IIITB Calculator======================================");

        while(true){
            try {

                System.out.println("NOTE : For any operation if output is NaN, it means input value is invalid, and chosen operation can't be performed on it");
                System.out.print("===== Operations =====\n\n0. Exit\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Square root\n6. Factorial\n7. Natural log\n8. Power\n\nChoose operation no. : ");

                op = scanner.nextInt();

                if (op == 0) {
                    System.out.println("...THANK YOU FOR USING OUR SERVICE...");
                    System.out.println("...HAVE A GOOD DAY...");
                    break;
                }

                if(op == 5){
                    System.out.print("Enter any non-negative real number : ");
                    num1 = scanner.nextDouble();
                }else if(op == 6){
                    System.out.print("Enter any positive integer number in range (1-20) : ");
                    ni = scanner.nextInt();

                }else if(op == 7){
                    System.out.print("Enter any non-negative real number : ");
                    num1 = scanner.nextDouble();
                }
                else if(op>=1 && op<=8){
                    System.out.print("Enter 1st operand : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter 2nd operand : ");
                    num2 = scanner.nextDouble();
                }

                switch (op) {

                    case 1:
                        System.out.println(num1 + " + " + num2 + " = " + calcOp.add(num1, num2) + "\n\n");
                        break;

                    case 2:
                        System.out.println(num1 + " - " + num2 + " = " + calcOp.subtract(num1, num2) + "\n\n");
                        break;

                    case 3:
                        System.out.println(num1 + " * " + num2 + " = " + calcOp.multiply(num1, num2) + "\n\n");
                        break;

                    case 4:
                        System.out.println(num1 + " / " + num2 + " = " + calcOp.divide(num1, num2) + "\n\n");
                        break;
                    case 5:
                        System.out.println("sqrt("+num1+")"+" = " + calcOp.squareRoot(num1) + "\n\n");
                        break;
                    case 6:
                        System.out.println(ni + "! = " +calcOp.factorial(ni)+"\n\n");
                        break;
                    case 7:
                        System.out.println("ln("+num1+") = "+ calcOp.naturalLog(num1)+"\n\n");
                        break;
                    case 8:
                        System.out.println("pow("+num1+","+num2+") = "+ calcOp.power(num1,num2)+"\n\n");
                        break;
                    default:
                        System.out.println("Please choose correct operation no. from above list");
                }
            }catch(Exception e){

                System.out.println("\n\n ====== Error =====\n\nSomething went wrong...please make sure you have entered correct inputs as asked\n\nE.g. \n-Don't enter -ve values for log operations\n-Only natural numbers are allowed for factorial ...etc\n\n");
                scanner.nextLine();
            }
        }

    }
}
