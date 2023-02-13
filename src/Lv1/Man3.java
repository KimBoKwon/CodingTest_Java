package Lv1;

public class Man3 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        int[] number = {-2, 3, 0, 2, -5};
        System.out.println(sol.solution(number));
    }
    
}

class Solution3 {
    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length; i++) {
            int first_num = number[i];
            for (int j = i+1; j < number.length; j++) {
                int second_num = number[j];
                for (int k = j+1; k < number.length; k++) {
                    if (first_num + second_num + number[k] == 0) {
                        answer += 1;
                    }
                }
            }
        }
        return answer;
    }
}
