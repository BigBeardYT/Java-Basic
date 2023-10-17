package com.yt.coreclass;

import java.util.Arrays;

public class Score {
    private int [] scores;
    public Score(int [] scores) {
        int [] nums = new int[scores.length];
        for(int i = 0;i < nums.length;i++) {
            nums[i] = scores[i];
        }
        this.scores = nums;
    }
    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
