/*addBorder.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Well of Integration
 *#72
 */

String[] addBorder(String[] picture) 
{
    String[] picWithBorder = new String[picture.length+2];
    int numAstrices = picture[0].length()+2;
    String astrixChain = "";
    for(int i=0;i<numAstrices;i++)astrixChain+="*";
    picWithBorder[0]=astrixChain;
    picWithBorder[picWithBorder.length-1]=astrixChain;
    for(int i=0;i<picture.length;i++)
    {
        picWithBorder[i+1]="*"+picture[i]+"*";
    }
    return picWithBorder;
}


