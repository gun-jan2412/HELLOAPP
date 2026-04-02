public class HelloApp {
    public static void main(String[] args) {
        String greeting;

        // Check if no arguments are provided
        if (args.length == 0) {
            greeting = "World";
        } else {
            // Join all arguments with comma and space
            greeting = String.join(", ", args);
        }

        // Print final greeting
        System.out.println("Hello, " + greeting + "!");
    }
}