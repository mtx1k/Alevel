package ua.shekhovtsov.module1.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Set Array Length: ");
        int arrayLength = Integer.parseInt(bufferedReader.readLine());
        if (arrayLength < 10) {
            System.out.println("Wrong array length");
            return;
        }
        DoSomeThingsWithRandomArray arrayAction = new DoSomeThingsWithRandomArray(arrayLength);
        System.out.println(arrayAction.toString());

        System.out.print("Set Sort Type(1 - Ascending, 0 - Descending): ");
        int choosingSortType = Integer.parseInt(bufferedReader.readLine());
        if (choosingSortType == 1) {
            new SortArray(arrayAction.getArray(), true);
        } else if (choosingSortType == 0) {
            new SortArray(arrayAction.getArray(), false);
        } else {
            System.out.println("Wrong input!");
            return;
        }
        System.out.println(arrayAction.toString());

        System.out.println(Arrays.toString(arrayAction.getCubeThirdElements()));
    }
}
