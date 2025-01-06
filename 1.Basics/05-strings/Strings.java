public class StringTypesExample {

    public static void main(String[] args) {

        // String literal (using double quotes)
        String literalString = "Hello, World!";

        // String using the constructor (not recommended for frequent use)
        String constructedString = new String("Hello, Java!");

        // Text Block 
        String textBlockString = """
                This is an example of a Text Block:
                - You can only use it on java 15+
                - You can use multiple lines.
                - Formatting is preserved.
                - Useful for creating complex texts like JSON, XML, or SQL.
                """;

        // String concatenation
        String part1 = "Welcome";
        String part2 = "to the Java world!";

        String concatenatedString = part1 + " " + part2;
        String concatMethodString = part1.concat(" ").concat(part2);

        // Single character using single quotes
        char singleCharacter = 'A';

        // Quotes inside Strings
        String quotesExample = "He said: \"Java is amazing!\"";
        String singleQuoteExample = "I'm learning Java.";

        // 7. Text Block with variables (formatted)
        String name = "John";
        int age = 25;
        String formattedTextBlock = """
                Name: %s
                Age: %d
                Status: Java student
                """.formatted(name, age);
    }
}
