import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class BlockingQueueTests {

    @Test
    public void everything_works() {
        var q = new BlockingQueue<String>(3);
        q.enqueue("Hello");
        q.enqueue("World");
        q.dequeue();
        Assertions.assertEquals("World", q.peek());
    }

    @Test
    @Tag("flaky")
    public void empty_queue_blocks_on_dequeue() {
        var thread = new Thread(() -> {
            var q = new BlockingQueue<String>(0);
            q.dequeue();
        });
        thread.start();
        while (thread.getState() == Thread.State.RUNNABLE) {
            Thread.yield();
        }
        Assertions.assertEquals(Thread.State.WAITING, thread.getState());
    }

}
