package general.Tasks_in_class;

public class ArrayTask {
    static void printLR(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            // If current row is even, print from
            // left to right
            if (i % 2 == 0) {

//          printRL -> if (i % 2 != 0)
//
//                for(int i = 0 ; i < matrix.length * matrix[0].length ; i++)
//                    sum += matrix[i % matrix.length][i / matrix.length];

//                The basic idea would be to map each index to
//                a value in a 2d-number space, using the fact that we know
//                the length of each "row" of the array (matrix.length). We can compose a single index, that
//                uniquely identifies two indices matrix[x][y], by z = x + y * matrix.length.
//                The reverse of this would then be:
//                x = z % matrix.length
//                y = z / matrix.length

                for (int j = 0; j < mat[0].length; j++)
                    System.out.print(mat[i][j] + " ");
                // If current row is odd, print from
                // right to left
            } else {
                for (int j = mat[0].length - 1; j >= 0; j--)
                    System.out.print(mat[i][j] + " ");
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        int mat[][] = new int[][]
                {
                        {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50}
                };
        printLR(mat);
        //TODO: printRL
    }
}