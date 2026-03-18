public class HelloApp {
    public static void main(String[] args) {

        String name;

        // If argument is provided, use it; otherwise default to "World"
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        System.out.println("Hello " + name);
    }
}
