package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        MathOperation operate = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println(operate.operate(2,3));

        StringManipulator stringToUppercase = s -> s.toUpperCase();
        System.out.println(stringToUppercase.manipulate("hello world!"));

        Function<String, Integer> countUppercase = (StringListProcessor::countUppercase);
        System.out.println(countUppercase.apply("ABCrgrtgABC"));

        Supplier<Integer> random = () -> RandomNumberGenerator.generateRandomNumber(1,100);
        System.out.println(random.get());

    }
}
