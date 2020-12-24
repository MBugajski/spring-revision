package com.MBugajski.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String a, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(a);
        System.out.println(a + " turns into: " + result);
    }
}
