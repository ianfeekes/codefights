/*mineSweeper.java
 *codefights
 *Arcade
 *Introduction
 *Island of Knowledge
 *#24
 *Created by Ian Feekes December 6th 2017
 */

/*For me this was one of the most exciting algorithms that codefights gave and I really enjoyed solving this one. Try it on your own before looking at my code!*/ 

int[][] minesweeper(boolean[][] matrix) 
{
    int[][] tileValues = new int[matrix.length][matrix[1].length];
    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0; j<matrix[i].length;j++)
        {
            int val=0; 
            int endParse=i+1;
            int endParse2=j+1;
            if(i==matrix.length-1)endParse--;
            if(j==matrix[i].length-1)endParse2--;
            for(int k=i-1;k<=endParse;k++)
            {
                if(k<0)k++;
                for(int l=j-1;l<=endParse2;l++)
                {
                    if(l<0)l++;
                    //System.out.print(k+" "+l+" ");
                    //System.out.print(matrix[k][l]+" ");
                    if(matrix[k][l]==true)val++;
                    //System.out.print(endParse+" "+endParse2+" ");
                }
            }
            if(matrix[i][j]==true)val--;
            tileValues[i][j]=val;
            //System.out.println("All digits for index finished val is "+val);
            
        }
    }
    return tileValues; 
}


