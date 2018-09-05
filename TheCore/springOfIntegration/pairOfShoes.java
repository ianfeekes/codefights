/*pairOfShoes.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *springOfIntegration
 *#90
 */

boolean pairOfShoes(int[][] shoes) 
{
    int numRightShoes = 0;
    int numLeftShoes = 0;
    for(int i=0;i<shoes.length;i++)
    {
        if(shoes[i][0]==0)numRightShoes++;
        else numLeftShoes++;
    }
    if(numRightShoes!=numLeftShoes)return false; 
    int numSizeRight=0; 
    int numSizeLeft=0; 
    for(int i=0;i<shoes.length;i++)
    {
        numSizeRight=0;
        numSizeLeft=0;
        for(int j=0;j<shoes.length;j++)
        {
            if(shoes[i][1]==shoes[j][1])
            {
                if(shoes[i][0]!=shoes[j][0])numSizeLeft++;
                else numSizeRight++;
            }
        }
        if(numSizeLeft!=numSizeRight)return false; 
    }
    return true; 
}


