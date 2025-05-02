public class StaircaseSearch2 {
    public static boolean search(int matrix[][],int key) {
        int row=matrix.length-1;
        int col=0;
        while(row>=0&&col<matrix[0].length) {
            if(matrix[row][col]==key) {
                return true;
            }
            else if(matrix[row][col]<key) {
                col++;
            }
            else {
                row--;
            }
        }
        return false;
    }
}
