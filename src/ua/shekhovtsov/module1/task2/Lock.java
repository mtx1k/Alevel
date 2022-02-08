package ua.shekhovtsov.module1.task2;

import java.util.Arrays;

public class Lock {
    private final int[] IMMUTABLE_ARRAY;

    public Lock(int[] unmutable_array) {
        IMMUTABLE_ARRAY = unmutable_array;
    }

    public int[] getUNMUTABLE_ARRAY() {
        return Arrays.copyOf(IMMUTABLE_ARRAY, IMMUTABLE_ARRAY.length);
    }
    public void printArray() {
        System.out.println(Arrays.toString(IMMUTABLE_ARRAY));
    }
}
