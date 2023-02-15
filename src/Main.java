import application.Fibonacci;
import config.setup.DecoratorInitializer;

public class Main {
    public static void main(String[] args) {
        DecoratorInitializer.initialize(Main.class.getClassLoader());
        var fibonacci = new Fibonacci();
        System.out.println(fibonacci.of(5));
    }
}
