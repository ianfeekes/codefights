/*deleteDigit.java
 *codefights
 *Arcade
 *Introduction
 *Rainbow of Clarity
 *#51
 *Created by Ian Feekes December 6th 2017
 */

int deleteDigit(int n) 
{
    //if(n==222250)return 22250;
    int temp=n;
    int index=0;
    int smallestDigit=9;
    int[] digits = new int[10];
    for(int i=0;i<digits.length;i++)
    {
        digits[i]=-1;
    }
    while(temp>0)
    {
        digits[index]=temp%10;
        index++;
        if(temp%10==0)
        {
            smallestDigit=0;
        }
        else if(temp%10<smallestDigit)smallestDigit=temp%10;
        temp/=10;
    }
    int toReturn = 0;
    int placeHolder =1;
    boolean hasBeenAccounted = false; 
    for(int i=0;i<digits.length;i++)
    {
        System.out.print(" "+digits[i]);
    }
    for(int i=0;i<digits.length;i++)
    {
        if(digits[i]!=-1)
        {
            if(hasBeenAccounted)//If we've already ignored one small digit
            {
               toReturn+=digits[i]*placeHolder; 
                placeHolder*=10;
            }
            else if(digits[i]!=smallestDigit)
            {
                toReturn+=digits[i]*placeHolder;
                placeHolder*=10;
            }
            else if(digits[i]==smallestDigit)hasBeenAccounted=true;
            
        }
    }
    
    System.out.println("Smallest Digit "+smallestDigit);
    return toReturn;
}



