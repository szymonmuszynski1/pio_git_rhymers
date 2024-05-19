package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_NUMBERS = 12;
    public static final int INIT_TOTAL = -1;
    public static final int IS_FULL_CONDITION = MAX_NUMBERS -1;
    public static final int IS_EMPTY_CONDITION = -1;
    public static final int ERROR_VALUE = -1;
    private final int[] numbers = new int[MAX_NUMBERS];

    private int total = INIT_TOTAL;

    public int getTotal() {
		return total;
	}

	public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == IS_EMPTY_CONDITION;
    }

    public boolean isFull() {
        return total == IS_FULL_CONDITION;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total--];
    }

}
