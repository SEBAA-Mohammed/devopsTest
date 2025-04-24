package org.est.devops.ms;

import org.est.devops.ms.services.MathUtils;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        MathUtils mathUtils = new MathUtils();
        System.out.println("Sum: " + mathUtils.addition(5, 10));
    }
}
