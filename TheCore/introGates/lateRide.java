/*lateRide.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Intro Gates
 *#7
 */

int lateRide(int n) 
{
    int mins = n%60;
    int hours = n/60;
    int toReturn = 0;
    while(mins>0)
    {
        toReturn+=mins%10;
        mins/=10;
    }
    while(hours>0)
    {
        toReturn+=hours%10;
        hours/=10;
    }
    return toReturn;
}


