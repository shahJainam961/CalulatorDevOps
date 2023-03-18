package org.app;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10);
        Calculator cal = new Calculator();
        cal.runService();
    }
}