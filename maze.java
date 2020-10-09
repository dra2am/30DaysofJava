
public class maze {
    public static void main(String[] args) {
        // [row][col] 2d arr
        int[][] data = { { 4, 6, 3, 10 }, { 4, 2, 40, 1 }, { 5, 34, 1, 43 } };

        // System.out.println(data[1][2]); // 40

        // iterates over rows
        for (int i = 0; i < data.length; i++) {
            // iterates over cols
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();

        }
    }
}
