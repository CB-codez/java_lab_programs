import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable {
    BlockingQueue<Integer> queue;

    Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Produced: " + i);
                queue.put(i); // waits if full
                Thread.sleep(500);
            }
        } catch (Exception e) {}
    }
}

class Consumer implements Runnable {
    BlockingQueue<Integer> queue;

    Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                int item = queue.take(); // waits if empty
                System.out.println("Consumed: " + item);
                Thread.sleep(800);
            }
        } catch (Exception e) {}
    }
}

public class Pc {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));

        producer.start();
        consumer.start();
    }
}