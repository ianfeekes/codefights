/*differentSquares.java
 *codefights
 *Arcade
 *Introduction
 *Land of Logic 
 *#55
 *Created by Ian Feekes December 6th 2017
 */

int differentSquares(int[][] matrix) {
    HashSet<String> vals = new HashSet<>();
    for(int i=0; i<matrix.length-1; i++){
        for(int j=0; j<matrix[i].length-1; j++){
            String temp = String.valueOf(matrix[i][j]) + ";" +
                String.valueOf(matrix[i+1][j]) + ";" +
                String.valueOf(matrix[i][j+1]) + ";" +
                String.valueOf(matrix[i+1][j+1]);
            vals.add(temp);
        }
    }
    return vals.size();
}
