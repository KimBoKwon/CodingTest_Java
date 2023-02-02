import java.util.Arrays;

public class App {
    public void main(String[] args) throws Exception {
        int[] arr = {1, 2};
        arr = removeElement(arr, 1);
        System.out.println(Arrays.toString(arr));
    }

    public int[] removeElement(int[] hofArr, int de_min) {
        return Arrays.stream(hofArr)
                .filter(i -> i != de_min)
                .toArray();
    }
}
