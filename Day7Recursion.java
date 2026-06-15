import java.util.*;

public class Day7Recursion {

    // ---------------- Basic Recursion ----------------

    public static void learningCallStack(int n) {

        if(n == 0){
            return;
        }

        System.out.println("Before Call : " + n);

        learningCallStack(n - 1);

        System.out.println("After Call : " + n);
    }

    public static void printDescending(int n) {

        if(n == 0){
            return;
        }

        System.out.println(n);

        printDescending(n - 1);
    }

    public static void printAscending(int n, int i) {

        if(i > n){
            return;
        }

        System.out.println(i);

        printAscending(n, i + 1);
    }

    // ---------------- Recursion Basics ----------------

    public static int sumOfNaturalNumbers(int n){

        if(n == 0){
            return 0;
        }

        return n + sumOfNaturalNumbers(n - 1);
    }

    public static int factorial(int n){

        if(n == 0){
            return 1;
        }

        return n * factorial(n - 1);
    }

    // ---------------- Permutation & Combination ----------------

    public static void permutation(int n, int r){

        int result = factorial(n) / factorial(n - r);

        System.out.println("Permutation = " + result);
    }

    public static void combination(int n, int r){

        int result = factorial(n) /
                    (factorial(r) * factorial(n - r));

        System.out.println("Combination = " + result);
    }

    // ---------------- Merge Sort ----------------

    public static void mergeSort(int[] arr,
                                 int left,
                                 int right){

        if(left >= right){
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        int[] leftArr =
                Arrays.copyOfRange(arr, left, mid + 1);

        int[] rightArr =
                Arrays.copyOfRange(arr, mid + 1, right + 1);

        int[] merged =
                mergeSortedArrays(leftArr,
                                  rightArr,
                                  new int[leftArr.length + rightArr.length]);

        for(int i = 0; i < merged.length; i++){
            arr[left + i] = merged[i];
        }
    }

    public static int[] mergeSortedArrays(int[] arr1,
                                          int[] arr2,
                                          int[] res){

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr1.length &&
              j < arr2.length){

            if(arr1[i] <= arr2[j]){
                res[k++] = arr1[i++];
            }
            else{
                res[k++] = arr2[j++];
            }
        }

        while(i < arr1.length){
            res[k++] = arr1[i++];
        }

        while(j < arr2.length){
            res[k++] = arr2[j++];
        }

        return res;
    }

    // ---------------- Grid Paths ----------------

    public static int countTotalPaths(int i,
                                      int j,
                                      int n,
                                      int m){

        if(i == n || j == m){
            return 0;
        }

        if(i == n - 1 &&
           j == m - 1){
            return 1;
        }

        int right =
                countTotalPaths(i, j + 1, n, m);

        int down =
                countTotalPaths(i + 1, j, n, m);

        return right + down;
    }

    public static void main(String[] args) {

        // Call Stack Demo
        // learningCallStack(5);

        // Print Numbers
        // printDescending(5);
        // printAscending(5, 1);

        // Sum of N Natural Numbers
        // System.out.println(sumOfNaturalNumbers(5));

        // Factorial
        // System.out.println(factorial(5));

        // Permutation & Combination
        // permutation(5, 2);
        // combination(5, 2);

        // Merge Sort
        /*
        int[] arr = {5,1,2,3,10,4};

        mergeSort(arr, 0, arr.length - 1);

        for(int val : arr){
            System.out.print(val + " ");
        }
        */

        // Grid Paths

        int paths = countTotalPaths(0,
                                    0,
                                    4,
                                    4);

        System.out.println("Total Paths = " + paths);
    }
}