package org.smjava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        UnnamedVariables.printXForEachElement(new Object[5]);
        UnnamedVariables.printErrorForEmptyElements(List.of("abc", "def", "", ""));
        UnnamedVariables.parseInputNumber("-50");
        UnnamedVariables.parseInputNumber("-50x");
        UnnamedVariables.printIsPreservingOrder(new HashSet<>());
        UnnamedVariables.printIsPreservingOrder(new LinkedHashSet<>());
        UnnamedVariables.printIsPreservingOrder(new TreeSet<>());
        UnnamedVariables.printRadiiOfCircles(List.of(
                new Object(),
                new UnnamedVariables.Circle(0, 0, 10),
                new UnnamedVariables.Circle(100, 100, 100)));
    }
}