/*minimalNumberOfCoins.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Well of Integration
 *#71
 */

int minimalNumberOfCoins(int[] coins, int price) 
{
    int numCoins = 0;
    for(int i=coins.length-1;i>=0;i--)
    {
       if(coins[i]<price)
       {
           int temp=price; 
           numCoins+=price/coins[i];
           price=price%coins[i];
       }
       if(price==0)break;
    }
    return numCoins; 
}


