/*addBorder.java
 *codefights
 *Arcade
 *Introduction
 *Exploring the Waters
 *#15
 *Created by Ian Feekes December 6th 2017
 */

String[] addBorder(String[] picture) {
    String[] toReturn = new String[picture.length+2];
    String str = "**";
    int len = picture[0].length();
    for(int i=0; i<len;i++)
    {
        str+="*";
    }
    for(int i=0; i<picture.length;i++)
    {
        String str1 = "*";
        str1+=picture[i];
        str1+="*";
        toReturn[i+1]=str1;
    }
    toReturn[0]=str;
    toReturn[toReturn.length-1]=str;
    return toReturn;
}



