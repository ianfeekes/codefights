/*TennisSet.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *At The Crossroads
 *#14
 */

boolean tennisSet(int score1, int score2) 
{
    int maxScore=0;
    int minScore=0;
    if(score1>score2)
    {
        maxScore=score1;
        minScore=score2;
    }
    else
    {
        minScore=score1;
        maxScore=score2;
    }
    if(maxScore==6)
    {
        return(minScore<5);
    }
    else if(maxScore==7)
    {
        return((minScore>=5)&&(minScore<7));
    }
    return false; 
}


