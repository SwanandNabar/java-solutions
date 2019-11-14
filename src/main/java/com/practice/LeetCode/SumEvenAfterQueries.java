package com.practice.LeetCode;

public class SumEvenAfterQueries {

    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
    	int sum = 0;
        int indexToAdd = 0;
        int valueToAdd = 0;
        int answer[] = {};
        int lengthOfInner = queries[0].length;

    	for (int i = 0; i < queries.length; i++) {
    	    for (int j = 0; j < lengthOfInner; j++) {
    	        indexToAdd = queries[i][j+1];
    	        valueToAdd = queries[i][j];
            }

            if (indexToAdd == A[i]) {
                A[i] = A[i + valueToAdd];
                for (int p = 0; p < A.length; p++) {
                    if (A[p] % 2 == 0) {
                        sum = A[p] + sum;
                        answer[p] = sum;
                    }
                }
            }
        }

    	return answer;
    }

    public static void main(String[] args) {
    	int arr [] = {1,2,3,4};
    	int queries[][] = {{1,0},{-3,1},{-4,0},{2,3}};
        sumEvenAfterQueries(arr, queries);
    }
}
    