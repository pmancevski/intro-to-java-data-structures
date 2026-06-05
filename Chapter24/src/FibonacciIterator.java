import java.util.Iterator;

public class FibonacciIterator implements Iterator<Long> {
    private final long limit;
    private long current = 0;
    private long next = 1;

    public FibonacciIterator(long limit) {
        this.limit = limit;
    }

    @Override
    public boolean hasNext() {
        return next <= limit;
    }

    @Override
    public Long next() {
        long result = next;
        long newNext = current + next;
        current = next;
        next = newNext;
        return result;
    }
}
