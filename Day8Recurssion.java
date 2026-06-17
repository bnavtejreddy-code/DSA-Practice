public class Day8Recurssion {

    public static void spiralMatrix(int[][] mat,
                                    int left,
                                    int right,
                                    int top,
                                    int bottom) {

        if(top > bottom || left > right){
            return;
        }

        // Top Row
        for(int i = left; i <= right; i++){
            System.out.print(mat[top][i] + " ");
        }

        // Right Column
        for(int i = top + 1; i <= bottom; i++){
            System.out.print(mat[i][right] + " ");
        }

        // Bottom Row
        if(top != bottom){
            for(int i = right - 1; i >= left; i--){
                System.out.print(mat[bottom][i] + " ");
            }
        }

        // Left Column
        if(left != right){
            for(int i = bottom - 1; i > top; i--){
                System.out.print(mat[i][left] + " ");
            }
        }

        spiralMatrix(mat,
                     left + 1,
                     right - 1,
                     top + 1,
                     bottom - 1);
    }

    public static void main(String[] args) {

        int[][] mat = {
            {1, 2, 3, 5},
            {8, 9, 4, 65},
            {7, 6, 5, 11},
            {87, 56, 15, 110}
        };

        int rows = mat.length - 1;
        int cols = mat[0].length - 1;

        spiralMatrix(mat, 0, cols, 0, rows);
    }
}