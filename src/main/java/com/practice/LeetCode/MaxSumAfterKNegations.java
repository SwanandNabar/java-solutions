package com.practice.LeetCode;

public class MaxSumAfterKNegations {

    public static int maximumSum(int arr[], int n, int k)
    {
        // Modify array K number of times
        for (int i = 1; i <= k; i++)
        {
            int min = Integer.MAX_VALUE;
            int index = -1;

            // Find minimum element in array for
            // current operation and modify it
            // i.e; arr[j] --> -arr[j]
            for (int j=0; j<n; j++)
            {
                if (arr[j] < min)
                {
                    min = arr[j];
                    index = j;
                }
            }

            // this the condition if we find 0 as
            // minimum element, so it will useless to
            // replace 0 by -(0) for remaining operations
            if (min == 0)
                break;

            // Modify element of array
            arr[index] = -arr[index];
        }

        // Calculate sum of array
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
        return sum;
    }


    // Driver program
    public static void main(String arg[])
    {
        int arr[] = {2,-3,-1,5,-4};
        int k = 2;
        int n = arr.length;
        System.out.print(maximumSum(arr, n, k));
    }
}
