import by.belstu.it.korshun.TestFunction;
import by.belstu.it.korshun.basejava.JavaTest;

public class Main {
    public static void main(String[] args) {
        HelloWorld();

        TestFunction obj = new TestFunction();

        for(int i = 0; i < 2; i++) System.out.println("SomeText");
        JavaTest.main();

    }

    private static void HelloWorld() {
        System.out.println("Hello world!");
    }
}