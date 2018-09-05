/*differentSquares.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Mirror Lake
 *#64
 */

int differentSquares(int[][] matrix) {
    HashSet<String> set = new HashSet<>();
    for(int i=0; i<matrix.length-1; i++){
        for(int j=0; j<matrix[i].length-1; j++){
            String temp = String.valueOf(matrix[i][j]) + ";" +
                String.valueOf(matrix[i+1][j]) + ";" +
                String.valueOf(matrix[i][j+1]) + ";" +
                String.valueOf(matrix[i+1][j+1]);
            set.add(temp);
        }
    }
    return set.size();
}


