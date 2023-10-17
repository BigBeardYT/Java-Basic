package com.yt.coreclass;

public class testScore {
    public static void main(String[] args) {
        int [] nums = new int[]{1 ,2 ,3, 4, 5};
        Score s = new Score(nums);
        s.printScores();
        nums[0] = 99;
        s.printScores();
    }
}
