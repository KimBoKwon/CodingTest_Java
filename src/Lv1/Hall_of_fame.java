package Lv1;

import java.util.Arrays;

public class Hall_of_fame {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        System.out.println(Arrays.toString(solution.solution(4, score2)));
    }

}

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] hofArr = new int[k];
        if(3 <= k && k <= 100 && 7 <= score.length && score.length <= 1000){
            for (int i = 0; i < k; i++) {
                if(0 <= score[i] && score[i] <= 2000){
                    hofArr[i] = score[i];
                    int min = 0;
                    if (i == 0){
                        min = score[i];
                    }else{
                        Arrays.sort(hofArr, 0, i);
                        min = hofArr[0];
                    }
                    answer[i] = min;
                }
            }
            for (int i = k; i < score.length; i++) {
                if(7 <= score.length && score.length <= 2000){
                    int min = min(hofArr)[0];
                    if(min < score[i]){
                        int idx = min(hofArr)[1];
                        hofArr[idx] = score[i];
                        min = min(hofArr)[0];
                    }else if(min > score[i]){
                        min = min(hofArr)[0];
                    }else if(min == score[i]){
                        min = min(hofArr)[0];
                    }
                    answer[i] = min;            
                }
            }
        }
        return answer;
    }

    public int[] min(int[] hofArr) {
        int min = hofArr[0];
        int idx = 0;
        for (int j = 1; j < hofArr.length; j++) {
            if (hofArr[j] < min){
                min = hofArr[j];
                idx = j;
            }
        }
        int[] arr = {min, idx};
        return arr;
    }
}

