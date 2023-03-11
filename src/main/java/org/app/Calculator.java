package org.app;

import java.util.Scanner;


public class Calculator {

    public int add(int a, int b){
        return a+b;
    }
    public void runService() {
        int num1, num2;
        boolean flag = true;
        char choice;
        Scanner scan = new Scanner(System.in);
        while(flag){
            try{
                System.out.println("Enter your two numbers (space separated)");
                num1 = scan.nextInt();
                num2 = scan.nextInt();
                System.out.println(add(num1,num2));
                System.out.println("You wanna continue (Y/N) ? : ");
                choice = scan.next().charAt(0);
                if(choice=='Y') continue;
                else flag = false;
            }
            catch(Exception e){
                System.out.println("e = " + e);
                return;
            }
        }
    }
}
