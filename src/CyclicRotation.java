import java.util.Arrays;

public class CyclicRotation {
    public static int[] solution(int[] A, int K) {

        int size = A.length;
        int[] rotated = new int [size];
        for (int x = 0; x < size; x++) {
            rotated[(x + K) % size] = A[x];
        }

        return rotated;
    }

    public static void main(String[] args) {
        int[] test = new int[]{3, 8, 9, 7, 6};
        int[] fin = solution(test,3);

        System.out.println(Arrays.toString(fin));

    }

}
