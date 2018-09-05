/*candles.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Loop Tunnel
 *#33
 */

int candles(int candlesNumber, int makeNew) 
{
    int toReturn = 0;
    while(candlesNumber>0)
    {
        toReturn++;
        candlesNumber--;
        if(toReturn%makeNew==0)candlesNumber++;
    }
    return toReturn;
}


