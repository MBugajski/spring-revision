package com.MBugajski.stream;

import com.MBugajski.stream.beautifier.PoemBeautifier;
import com.MBugajski.stream.lambda.ExpressionExecutor;
import com.MBugajski.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier= new PoemBeautifier();
        System.out.println("Beautifying sentences");
        poemBeautifier.beautify("Roses are red.", a -> a.toUpperCase());
        poemBeautifier.beautify("Roses are red.", a -> a.toLowerCase());
        poemBeautifier.beautify("Roses are red.", a -> a+a);
        poemBeautifier.beautify("Roses are red.", a -> a + " Violets are blue.");

    }
}
