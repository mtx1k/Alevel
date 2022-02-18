package ua.shekhovtsov.module1.task2;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        Lock lock = new Lock(array);
        lock.printArray();
        lock.getIMMUTABLE_ARRAY()[0] = 10;
        lock.printArray();
    }
}
