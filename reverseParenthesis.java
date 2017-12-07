/*reverseParenthesis.java
 *codefights
 *Arcade
 *Introduction
 *Smooth Sailing
 *#13
 *Created by Ian Feekes December 6th 2017
 */

/*This is an appropriate end to the "Smooth Sailing" unit as it is one of the first algorithms that poses a very genuine challenge. This one originally took my quite a long time to wrap my head around, and if I had to re-write it (which I may eventually do in a different programming language), it would still take me a bit to figure it out. */ 

/*NOTE: It's a good idea to try and solve this one recursively: The only problem I had was that there are often non-nested parenthesis that must be accounted for in the main method using an initial for() loop, so you have to make sure that the recursion accounts for everything, but doesn't affect anything outside of the parenthesis. This program may be handled better in a different programming language like C, which naturally represents Strings as character arrays (which comes in useful for parsing through Strings as this method requires you to do)*/ 

String reverseParentheses(String s) 
{
    int[] indicesOfFront = new int[s.length()];     // all indices of (
    int[] indicesOfBack = new int[s.length()];      // all indices of )
    int ind1 = 0;
    int ind2 = 0;
    char[] charArray = new char[s.length()];        //character representation of the string so that reversing characters can be easily done
    for(int i=0; i<s.length();i++)
    {
        indicesOfFront[i]=-1;
        indicesOfBack[i]=-1;
        charArray[i]=s.charAt(i);                   //character array now properly represents the string
        if(charArray[i]=='(') 
        {
            indicesOfFront[ind1]=i;
            ind1++;
        }
        if(charArray[i]==')')
        {
            indicesOfBack[ind2]=i;
            ind2++;
        }
    }
    for(int i=0;i<ind1;i++)findMinParenthesis(indicesOfFront, indicesOfBack, charArray);
    String str = "";
    for(int k=0; k<s.length();k++)                  //now we go through the character array
    {
        if((charArray[k]!='(')&&(charArray[k]!=')'))str+=charArray[k];  
    }
    return str;
}

void reverse(int l, int r, char[] cArray)
{
    char temp;
    for(int i=l; i<r; i++)
    {
        if(cArray[i]!='(')
        {
            while(cArray[r]==')') r--;
            System.out.println("Swapping "+cArray[i]+" with "+cArray[r]);
            temp = cArray[i];
            cArray[i]=cArray[r];
            cArray[r]=temp;
             r--;
        }
    }
    for(int i=0;i<cArray.length;i++)
    {
        System.out.print(cArray[i]+" ");
    }
    System.out.println();
}

void findMinParenthesis(int[] indicesOfFront, int[] indicesOfBack, char[] charArray)
    {
    int minimum=indicesOfFront.length;
    int lIndex = -1;
    int rIndex = -1;
    int i=0;
    int ind1=0;
    int ind2=0;
    while(indicesOfBack[i]!=-1)
    {
        int j=0;
        while(indicesOfFront[j]!=-1)
        {
            if((indicesOfBack[i]!=-2)&&(indicesOfFront[j]!=-2)&&(indicesOfBack[i]>indicesOfFront[j]))
            {
                if(indicesOfBack[i]-indicesOfFront[j]<minimum)
                {
                    minimum = indicesOfBack[i]-indicesOfFront[j];
                    lIndex=indicesOfFront[j];
                    rIndex=indicesOfBack[i];
                    ind1=j;
                    ind2=i;
                }
            }
            j++;
        }
        i++;
    }
    reverse(lIndex, rIndex, charArray);
    indicesOfFront[ind1]=-2;
    indicesOfBack[ind2]=-2;
    System.out.println("left index is "+lIndex+" right index is "+rIndex);
    }
    


