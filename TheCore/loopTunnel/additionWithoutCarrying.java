/*additionWithoutCarrying.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Loop Tunnel
 *#29
 */

int additionWithoutCarrying(int param1, int param2) 
{
    int toReturn=0;
    int placeHolder = 1;
    while((param1>0)||(param2>0))
    {
        toReturn+=((param1%10+param2%10)%10)*placeHolder;
        placeHolder*=10;
        if(param1>0)param1/=10;
        if(param2>0)param2/=10;
    }
    return toReturn;
}
