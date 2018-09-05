/*HTMLEndTagByStartTag.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Book Market
 *#56
 */

String htmlEndTagByStartTag(String startTag)
{
    String result = "</";
    int i = 1;
    while((i<startTag.length()-1)&&(startTag.charAt(i)!=' '))
    {
        result +=startTag.charAt(i);
        i++;
    }
    result += '>';
    return result; 
}

