package ru.plidia.hw.util;

public class NumbersAction {
    public static void action() {
        int[] arr = {6, 8, -9, 45};
        int indexFirst = 0;
        int indexSecond = 1;
        int num = 0;
        while (arr[0] > arr[1] || arr[1] > arr[2] || arr[2] > arr[3]) {
            if (arr[indexFirst] > arr[indexSecond]) {
                num = arr[indexSecond];
                arr[indexSecond] = arr[indexFirst];
                arr[indexFirst] = num;
            }
            if (indexFirst < 2 && indexSecond < 3) {
                indexFirst++;
                indexSecond++;
                num++;
            } else {
                indexFirst = 0;
                indexSecond = 1;
                num = 0;
            }
        }
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
    }
}
