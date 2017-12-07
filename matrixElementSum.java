//MatrixElementSum.java
//Codefights
//Arcade
//Introduction
//Edge of the Ocean
//#8
//Created by Ian Feekes December 6th 2017

int matrixElementsSum(int[][] matrix) {
 int price =0;
 boolean cont;
 for(int i=0; i<matrix.length; i++)
 {
  System.out.println();
  cont = true; 
  for(int j=0; j<matrix[i].length; j++)
  {
   System.out.print(matrix[i][j]+", ");
   if(matrix[i][j]==0) 
   {
    for(int k=i;k<matrix.length;k++) matrix[k][j]=0;
   }
   price+=matrix[i][j];
  }
 }
 return price;
}
