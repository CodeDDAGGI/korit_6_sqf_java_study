package com.study.java_study.ch06_배열;

public class ArrayMain01 {
    public static void main(String[] args) {
        // 배열 사용하는 이유
        // 한번에 보낼 수 도 있고, 배열의 각 해당값을 전달할수 도있음
        // 반복

        // int 4byte * 공간 100개 = 총 100개
        int[] nums = new int[100];

        for (int i = 0; i < 100; i++) {
            nums[i] = (i + 1) * 10; // nums[0] = 10
        }

        for (int num : nums) { // 향상된 for문 = forEach
            // 배열의 처음부터 끝까지 반복을 함
            // 단점:index로 조회가 안댐
            System.out.println(num);
        }

        for(int i = 0; i < nums.length; i++) {
            if (i % 2== 0){
                continue;
            }
            int num = nums[i];
            System.out.println(num);
        }
    }
}
