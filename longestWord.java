/*longestWord.java
 *codefights
 *Arcade
 *Introduction
 *Land of Logic 
 *#52
 *Created by Ian Feekes December 6th 2017
 */

String longestWord(String text) 
{
    int beginParse =0;
    int endParse = 0;
    int tempBeginParse = 0;
    int tempEndParse = 0;
    for(int i=0;i<text.length();i++)
    {
        if(text.charAt(i)!=' ')
        {
            tempBeginParse=i;
            while((((int)text.charAt(i)>96)&&((int)text.charAt(i)<123))||((int)text.charAt(i)>64)&&((int)text.charAt(i)<91))
            {
                i++;
                if(i==text.length())break;
            }
            tempEndParse = i;
            if(tempEndParse-tempBeginParse>endParse-beginParse)
            {
                endParse=tempEndParse;
                beginParse=tempBeginParse;
            }
        }
    }
    return text.substring(beginParse, endParse);
}


