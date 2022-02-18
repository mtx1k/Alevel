package ua.shekhovtsov.module1.task1;

import java.util.Arrays;
import java.util.Random;

public class DoSomeThingsWithRandomArray {
    private int length;
    private int[] array;

    public int getLength() {
        return length;
    }

    public int[] getArray() {
        return array;
    }

    DoSomeThingsWithRandomArray(int length) {
        this.length = length;
        array = new int[length];
        fillArrayRandomNumbers();
    }

    private void fillArrayRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < this.length; i++) {
            array[i] = 100 - random.nextInt(201);
        }
    }

    public int[] getCubeThirdElements() {
        int[] temp = Arrays.copyOf(this.array, this.length);
        for (int i = 0; i < temp.length; i += 3) {
            temp[i] = (int) Math.pow(temp[i], 3);
        }
        return temp;
    }

    public String toString() {
        return Arrays.toString(array);
    }
}
