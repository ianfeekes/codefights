/*digitDegree.java
 *codefights
 *Arcade
 *Introduction
 *Dark Wilderness
 *#41
 *Created by Ian Feekes December 6th 2017
 */

int digitDegree(int n)
{
    int degree =0;
    if(n/10==0) return 0;
    while(n>0)
    {
        if(n%10!=0)degree++;
        n/=10;
    }
    return degree;
}


