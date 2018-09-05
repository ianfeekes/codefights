/*phoneCall.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Intro Gates
 *#8
 */

int phoneCall(int min1, int min2_10, int min11, int s) 
{
    int duration = 0;
    if(s==min1)return 1;
    while(s>0)//while we have money
    {
        duration++;
        if(duration==1)s-=min1;
        else if(duration<=10)s-=min2_10;
        else s-=min11;
        if(s<0)duration--;
    }
    return duration;
}


