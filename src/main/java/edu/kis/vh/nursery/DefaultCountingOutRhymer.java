package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int START_VALUE = -1;

    private final int[] NUMBERS = new int[SIZE];
    
    public int total = START_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == START_VALUE;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return START_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return START_VALUE;
        return NUMBERS[total--];
    }

}
