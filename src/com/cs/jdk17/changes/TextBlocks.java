package com.cs.jdk17.changes;

import static com.cs.jdk17.utils.PrettyPrinter.*;

public class TextBlocks {

    private static final String exampleTextInBlock = """
             Example text for java 17 workshop""";

    private static final String exampleStructureWithEscapes = """
            "Example" text for
                "java 17" workshop\"""
                        with tabs
                and      spaces
            """;

    private static final String jsonBlock = """
            {
              "name": "Joseph",
              "age": 45,
              "address": "Sesame Street, 2"
            }
            """;

    private static final String jsonBlockFormatted = """
            {
              "name": "%s",
              "age": %d,
              "address": "%s"
            }
            """.formatted("Josh", 18, "Sesame Street, 5");

    private static String jsonBlockGenerator(String name, Integer age){
        return """
            {
              "name": "%s",
              "age": %d
            }
            """.formatted(name, age);
    }

    private static String jsonBlockGeneratorWithReplace(String name, Integer age){
        var jsonBody = """
            {
              "name": "${name}",
              "age": ${age}
            }
            """;
        return jsonBody
                .replace("${name}", name)
                .replace("${age}", String.valueOf(age));
    }

    public static void printTextBlocks() {
        prettyPrintHeader("Simple text blocks");

        prettyPrintSection("Text in block");
        System.out.println(exampleTextInBlock);

        prettyPrintSection("Text in block with tabs and escapes");
        System.out.println(exampleStructureWithEscapes);
    }

    public static void printJsonBlocks() {
        prettyPrintHeader("JSON text blocks");

        prettyPrintSection("JSON block");
        System.out.println(jsonBlock);

        prettyPrintSection("JSON block formatted");
        System.out.println(jsonBlockFormatted);

        prettyPrintSection("JSON block formatted from generator method");
        System.out.println(jsonBlockGenerator("James", 20));

        prettyPrintSection("JSON block formatted from generator method with replace");
        System.out.println(jsonBlockGeneratorWithReplace("John", 12));
    }

    public static void printAllTextBlocks() {
        prettyPrintTitle("Text blocks");

        printTextBlocks();

        printJsonBlocks();
    }
}
