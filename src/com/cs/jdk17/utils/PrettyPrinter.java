package com.cs.jdk17.utils;

import java.util.List;
import java.util.stream.IntStream;

/**
 * This is a utility class for results displaying purposes
 */
public class PrettyPrinter {

    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";

    public static void prettyPrintTitle(String title){
        System.out.println(TEXT_BLUE);
        System.out.println("#".repeat(7 + title.length() + 7));
        System.out.printf("###### %s ######%n", title.toUpperCase());
        System.out.println("#".repeat(7 + title.length() + 7));
        System.out.println(TEXT_RESET);
    }

    public static void prettyPrintHeader(String header){
        System.out.print(TEXT_PURPLE);
        System.out.println("-".repeat(3 + header.length() + 3));
        System.out.printf("-- %s --%n", header);
        System.out.println("-".repeat(3 + header.length() + 3));
        System.out.print(TEXT_RESET);
    }

    public static void prettyPrintSection(String section){
        System.out.printf(TEXT_YELLOW + "%n%s:%n" + TEXT_RESET, section);
    }

    public static void prettyPrintSectionWithIndex(int index, String section){
        System.out.printf(TEXT_YELLOW + "%n%d) %s:%n" + TEXT_RESET, index, section);
    }

    public static void prettyPrintSections(List<String> sections){
        IntStream.range(0, sections.size())
                .forEach(i -> prettyPrintSectionWithIndex(i+1, sections.get(i)));
    }
}
