public class ColumnMajorTraversal {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};

        // Column-major traversal
        for (int col = 0; col < array[0].length; col++) {
            for (int row = 0; row < array.length; row++) {
                System.out.println(array[row][col]);
            }
        }
    }
}
