package WhizLabs;

public class ThreeDimensionArray {
    public static void main(String... args) {
        int a[][][] = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}};
        //int i, j, k;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; i < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.println(a[i][j][k]);
                }
            }
        }
    }
}
