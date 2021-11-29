package capgemini.a7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Lambda8 {

	public static void main(String[] args) throws InterruptedException {

        Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<>());
        Runnable listOperations = () -> {
            syncCollection.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        };

        Thread thread1 = new Thread(listOperations);
        Thread thread2 = new Thread(listOperations);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(syncCollection);//in output we arr grtting numbers format two times because we created two threads and
        //invoking 2 threads at a same time so dont confuse


    }
}
