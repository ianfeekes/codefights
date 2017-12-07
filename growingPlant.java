/*growingPlant.java
 *codefights
 *Arcade
 *Introduction
 *Dark Wilderness
 *#38
 *Created by Ian Feekes December 6th 2017
 */

int growingPlant(int upSpeed, int downSpeed, int desiredHeight) 
{
    int x = 0;
    int day = 0;
    while(x<desiredHeight)
    {
        day++;
        x+=upSpeed;
        if(x>=desiredHeight) return day;
        x-=downSpeed;
    }
    System.out.println("x is "+x);
    return day-1;
}


