package com.cs.jdk17;

import static com.cs.jdk17.changes.PatternMatchingForInstanceOf.printAllPatternMatchingForInstanceOf;
import static com.cs.jdk17.changes.Records.printAllRecords;
import static com.cs.jdk17.changes.SwitchExpressions.printAllSwitchExpressions;
import static com.cs.jdk17.changes.TextBlocks.printAllTextBlocks;

public class Main {

    public static void main(String[] args) {

        // 1 - Text blocks
        printAllTextBlocks();

        // 2 - Switch expressions
        printAllSwitchExpressions();

        // 3 - Records
        printAllRecords();

        // 4 - Pattern matching for InstanceOf
        printAllPatternMatchingForInstanceOf();

        // 5 - Other
        // Sealed Classes
        // Helpful NullPointerExceptions
        // Stream.toList() without collectors

    }

}
