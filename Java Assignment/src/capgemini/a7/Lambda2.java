package capgemini.a7;

import java.util.Arrays;
import java.util.List;

public class Lambda2 {
	public static void main(String[] args) {
        List<Order> order = Arrays.asList(
                new Order(600,"ACCEPTED"),
                new Order(700,"COMPLETED"),
                new Order(300,"ACCEPTED"),
                new Order(15000,"ACCEPTED"),
                new Order(12000,"REJECTED"),
               new Order(12000,"REJECTED"),
              new Order(12000,"INVALID"));
        order.stream().filter(o -> o.getPrice() > 10_000).forEach(System.out::println);
        order.stream().filter(o ->(o.getStatus().equals("ACCEPTED")) || o.getStatus().equals("COMPLETED")).forEach(System.out::println);

    }
}
