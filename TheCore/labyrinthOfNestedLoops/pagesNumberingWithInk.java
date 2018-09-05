/*pagesNumberingWithInk.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Labyrinth of Nested Loops
 *#46
 */

int pagesNumberingWithInk(int current, int numberOfDigits) 
{
    while(numberOfDigits>0)
    {
        int temp=current;
        while(temp>0)
        {
            numberOfDigits--;
            temp/=10;
            if(numberOfDigits<0)return current-1;
        }
        //if(numberOfDigits<0)current--;
        if(numberOfDigits==0)return current; 
        current++;
        //if(numberOfDigits<0)current--;
        
    }
    return current; 
}


