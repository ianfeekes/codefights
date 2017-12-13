/*sudoku.java
 *codefights
 *Arcade
 *Introduction
 *Land of Logic
 *#60
 *Created by Ian Feekes December 6th 2017
 */

boolean sudoku(int[][] grid) 
{
    if(!checkSubGrids(grid))return false;
    if(!checkRows(grid)) return false;
    if(!checkColumns(grid))return false;
    return true;
}

boolean checkColumns(int[][]grid)
{
    for(int i=0;i<grid.length;i++)
    {
        boolean[] integers = new boolean[9];
        for(int k=0;k<integers.length;k++)
        {
            integers[k]=false;
        }
        for(int j=0;j<grid[i].length;j++)
        {
            integers[grid[j][i]-1]=true;
        }
        for(int k=0;k<integers.length;k++)
        {
            if(integers[k]==false)return false;
        }
    }
    return true;
}

boolean checkRows(int[][]grid)
{
    for(int i=0;i<grid.length;i++)
    {
        boolean[] integers = new boolean[9];
        for(int k=0;k<integers.length;k++)
        {
            integers[k]=false;
        }
        for(int j=0;j<grid[i].length;j++)
        {
            integers[grid[i][j]-1]=true;
        }
        for(int k=0;k<integers.length;k++)
        {
            if(integers[k]==false)return false;
        }
    }
    return true;
}

boolean checkSubGrids(int[][]grid)
{
    for(int i=0;i<grid.length;i+=3)
    {
        for(int j=0;j<grid[i].length;j+=3)
        {
            boolean[] integers = new boolean[9];
            for(int k=0;k<integers.length;k++)
            {
                integers[k]=false;
            }
            for(int k = i;k<i+3;k++)
            {
                for(int l=j;l<j+3;l++)
                {
                    integers[grid[k][l]-1]=true; 
                }
            }
            for(int k=0;k<integers.length;k++)
            {
                if(integers[k]==false)return false;
            }
        }
    }
    return true;
}

