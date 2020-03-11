package src;

import java.util.Arrays;

class Sample1_3 {
    public static void main (String args[]){
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 2, 2, 2};
        int[] array3 = {1, 2, 3, 4};
        int[] array4 = {10, 2, 3, -10, 20};
        int[] array5 = {1, 0, 1, 0};
        int[] array6 = {0, 1, 1, 1};

        //result1はfalse
        boolean result1 = ArrayUtil.isEqual(array1);
        System.out.println("array1: " + result1);

        //result2はtrue
        boolean result2 = ArrayUtil.isEqual(array2);
        System.out.println("array2: " + result2);


        int result3 =  ArrayUtil.min(array3);
        System.out.println("Min value in array3 is " + result3);

        int result4 = ArrayUtil.min(array4);
        System.out.println("Min value in array4 is " + result4);

        int result5[] = ArrayUtil.and(array5, array5);
        System.out.println(Arrays.toString(result5));

        int result6[] = ArrayUtil.and(array5, array6);
        System.out.println(Arrays.toString(result6));

    }
}