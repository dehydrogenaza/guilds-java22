package org.smjava;

import java.util.*;

class UnnamedVariables {
    static void printXForEachElement(Object[] elements) {
        for (Object _ : elements) {
            System.out.println("X"); //enforces that _ is unused
        }
    }

    static void printErrorForEmptyElements(List<String> elements) {
        elements.stream()
                .filter(String::isEmpty)
                .forEach(_ -> System.out.println("error")); //unused lambda parameter
    }

    static void parseInputNumber(String input) {
        try {
            int parsedNumber = Integer.parseInt(input);
            System.out.println(parsedNumber);
        } catch (NumberFormatException _) { //unused exception instance
            System.out.println("Not a number");
        }
    }

    static void printIsPreservingOrder(Set<?> set) {
        switch (set) { // in pattern matching
            case TreeSet<?> _ -> System.out.println("sorts elements by values");
            case LinkedHashSet<?> _ -> System.out.println("preserves insertion order");
            case HashSet<?> _ -> System.out.println("does not preserve order");
            default -> System.out.println("unknown set subtype");
        }
    }

    static void printRadiiOfCircles(List<Object> figures) {
        figures.forEach(figure -> {
            if (figure instanceof Circle(_, _, double radius)) {
                System.out.println(radius);
            }
        });
    }

    record Circle(double x, double y, double r) {}
}
