
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        //Задание 1
        Predicate<Integer> predicate = new Predicate<Integer>() {

            @Override
            public boolean test(Integer integer) {
                return integer > 0 ? true : false;
            }
        };
        System.out.println(predicate.test(10));

        Predicate<Integer> predicate1 = number -> number > 0;
        System.out.println(predicate1.test(-5));

        //Задание 2
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Hello " + name);
            }
        };
        consumer.accept("Alex");

        Consumer<String> consumer1 = str -> System.out.println("Hello " + str);
        consumer1.accept("Bob");

        //Задание 3
        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println(function.apply(7.3));

        Function<Double, Long> function1 =  aDouble ->  Math.round(aDouble);
        System.out.println(function1.apply(8.4));

        //Задание 4
        Supplier<Integer> supplier = new Supplier<Integer>() {

            @Override
            public Integer get() {
                return (int) (Math.random() * 100);
            }
        };

        System.out.println(supplier.get());

        Supplier<Integer> supplier1 = () -> (int) (Math.random() * 100);

        System.out.println(supplier1.get());

    }
    //Задание 5
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return a -> condition.test(a) ? ifTrue.apply(a) : ifFalse.apply(a);
    }
}