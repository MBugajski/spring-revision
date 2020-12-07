package com.MBugajski.testing;

import com.MBugajski.testing.calculator.Calculator;
import com.MBugajski.testing.user.SimpleUser;

import java.util.Random;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Random random = new Random();
        Calculator calculator = new Calculator();

        int int1 = random.nextInt(100);
        int int2 = random.nextInt(100);

        int resultAdd = int1 + int2;
        if (resultAdd == calculator.add(int1, int2)) {
            System.out.println("test ok");
        } else {
            System.out.println("Error!");
        }

        int resultSubtract = int1 - int2;
        if (resultSubtract == calculator.subtract(int1, int2)) {
            System.out.println("test ok");
        } else {
            System.out.println("Error!");
        }
    }
}
