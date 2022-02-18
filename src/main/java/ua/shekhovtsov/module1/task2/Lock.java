package ua.shekhovtsov.module1.task2;

import java.util.Arrays;

public class Lock {
    private final int[] IMMUTABLE_ARRAY;

    public Lock(int[] immutable_array) {
        IMMUTABLE_ARRAY = immutable_array;
    }

    public int[] getIMMUTABLE_ARRAY() {
        return Arrays.copyOf(IMMUTABLE_ARRAY, IMMUTABLE_ARRAY.length);
    }

    public void printArray() {
        System.out.println(Arrays.toString(IMMUTABLE_ARRAY));
    }
}
