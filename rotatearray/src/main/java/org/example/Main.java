package org.example;

public class Main {
    public static void main(String[] args) {
        int[] result = {3, 8, 9, 7, 6};
        System.out.println(Solution.solution(result,3));
    }
    static class Solution {
        public static int[] solution(int[] A, int K) {
            int[] rotatedA = new int[A.length];

            for (int i = 0; i < A.length; i++) {
                //rotated index needs to "wrap" around end of array
                int rotatedIndex = (i + K) % A.length;

                rotatedA[rotatedIndex] = A[i];
            }
            return rotatedA;
        }
    }
}