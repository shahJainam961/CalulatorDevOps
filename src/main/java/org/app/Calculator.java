package org.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;


public class Calculator {

    private static final Logger log = LogManager.getLogger(Calculator.class);

    public int add(int a, int b){
        return a+b;
    }
    public void runService() {

        int num1, num2, num3;
        boolean flag = true;
        char choice;
        Scanner scan = new Scanner(System.in);
        while(flag){
            try{
                System.out.println("Enter your two integers(space separated)");
                num1 = scan.nextInt();
                num2 = scan.nextInt();
                num3 = add(num1,num2);
                System.out.println(num3);
                System.out.println("You wanna continue (Y/N) ? : ");
                choice = scan.next().charAt(0);
                log.info("|| Operation on "+num1+" and "+num2+" ==> "+num3+" ||");
                if(choice!='Y'){
                    flag = false;
                    log.info("Exited...");
                }
            }
            catch(Exception e){
                System.out.println(e);
                return;
            }
        }
    }
}
