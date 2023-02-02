package Lv1;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Solution1 st = new Solution1();
        st.solution1();
    }
}

class Solution1{
    public void solution1() {
        int[] arr = {1, 2, 0, 0};
        int num = 0;
        arr = removeElement(arr, num);
        System.out.println(Arrays.toString(arr));
    }

    public int[] removeElement(int[] hofArr, int de_min) {
        return Arrays.stream(hofArr)
                .filter(i -> i != de_min)
                .toArray();
    }
}
