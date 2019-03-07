package com.practice.LeetCode;

public class SearchInRotatedSortedArray {

    /*
    This algorithm is implemented by using binary search by calculating the mid point of the array and then searching through
    the first half and then the second half. The algorithm also used recursion mechanism to search through different sub arrays
     */


    /*
        When the search function takes 4 arguments
     */
    public static int search (int arr[], int lowerIndex, int higherIndex, int key) {

        if (lowerIndex > higherIndex) {
            return -1;
        }

        int midPoint = (lowerIndex + higherIndex) /2;

        if (arr[midPoint] == key) {
            return  midPoint;
        }
        if (arr[lowerIndex] <= arr[midPoint]) {
            if (key >= arr[lowerIndex] && key <= arr[midPoint]) {
                return search(arr, lowerIndex, midPoint -1, key);
            }
            return search(arr, midPoint + 1, higherIndex, key);
        }

        if (key >= arr[midPoint] && key <= arr[higherIndex]) {
            return search(arr, midPoint + 1, higherIndex, key);
        }
        return search(arr, lowerIndex, midPoint -1, key);
    }


    /*
        When the search function takes only 2 arguments. This does not use recursion
     */
    public static int searchWithTwo  (int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) return mid;

            if (nums[start] <= nums[mid]) {
                if (target < nums[mid] && target >= nums[start]) end = mid - 1;
                else start = mid + 1;
            }

            if (nums[mid] <= nums[end]) {
                if (target > nums[mid] && target <= nums[end]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,9,1,2,3};
        int n = arr.length;
        int key = 6;
//        int i = search(arr, 0, n-1, key);
        int j = searchWithTwo(arr, key);
//        if (i != -1 || j != 1) {
//            System.out.println("this is i:" + i + " this is j: " + j);
//        } else {
//            System.out.println("key not found");
//        }
    }
}
