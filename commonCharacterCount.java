/*commonCharacterCount.java
 *codefights
 *Arcade
 *Introduction
 *Smooth Sailing
 *#10
 *Created by Ian Feekes December 6th 2017
 */

 /*NOTE: This could have been made much easier and elegant had I used hashing methods. I have learned my lesson. Nonetheless this will help you solve the algorithm, just know that if you are looking for more elegant solutions to code please try and go with hash methods.*/ 

int commonCharacterCount(String s1, String s2) {
    int charsInCommon=0;
    int[] indicesAlreadyTallied = new int[s2.length()];
    for(int i=0; i<indicesAlreadyTallied.length; i++)
    {
        indicesAlreadyTallied[i]=-1;
    }
    int index = 0;
    boolean charNotFound;
    int charCounter;
    boolean charAlreadyAccounted;
    for(int i=0; i<s1.length(); i++)
    {
        charCounter = 0;
        charNotFound=true;
        while((charNotFound)&&(charCounter<s2.length()))
        {
            //System.out.println("charCounter is currently "+charCounter);
            charAlreadyAccounted = false;
            //System.out.println(s1.charAt(i)+" compared to: "+s2.charAt(charCounter));
            for(int j=0;j<indicesAlreadyTallied.length;j++)
            {
                //System.out.println("comparing char" +charCounter+" with index "+indicesAlreadyTallied[j]);
                if(charCounter==indicesAlreadyTallied[j])
                {
                    charAlreadyAccounted = true;
                    System.out.println("charAlreadyAccounted "+charAlreadyAccounted);
                    //System.out.println("char has already been counted at "+charCounter);
                }
            }
            if((!charAlreadyAccounted)&&(s1.charAt(i)==(s2.charAt(charCounter))))//something is wrong with this if statement
            {
                System.out.println("character in common found. "+s1.charAt(i)+" and "+s2.charAt(charCounter));
                charsInCommon++;
                //System.out.println("the index should be filled as "+charCounter);
                indicesAlreadyTallied[index]=charCounter;
                index++;
                charNotFound=false;
            }
            else charCounter++;
        }
    }
    for(int i=0; i<indicesAlreadyTallied.length;i++)
    {
        System.out.print(indicesAlreadyTallied[i]+", ");
    }
    return charsInCommon;
}



