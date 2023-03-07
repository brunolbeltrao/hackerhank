package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.solution(110));
    }

    static class Solution {
        public static int solution(int N) {
            // Implement your solution here
            int zeroSequence = 0;
            int MaxSequence = 0;
            int numbers1 = 0;
            String bin = Integer.toBinaryString(N);
            for (int i = 0; i < bin.length(); i++) {
                char c = bin.charAt(i);
                if (Integer.parseInt(String.valueOf(c)) ==0 ){
                    zeroSequence++;
                }else{
                    numbers1++;
                    zeroSequence = 0;
                }
                MaxSequence = zeroSequence > MaxSequence ? zeroSequence : MaxSequence;
            }

            return numbers1 > 1 ? MaxSequence:0;
        }
    }
}