package Demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class print2largest {

    public static void main(String[] args) {
        Integer[] arr = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        print2largestz(arr, n);
    }

    static void print2largestz(Integer[] arr, int n) {
        int last = n - 1;
        System.out.println("Length : " + n +" "+ arr[last] + " last :"+ last);
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[0]) {
                System.out.printf("The second largest  element is %d",arr[i]);
                return;
            }
        }
    }


}
