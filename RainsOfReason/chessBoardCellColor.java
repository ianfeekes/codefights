/*chessBoardCellColor.java
 *codefights
 *Arcade
 *Introduction
 *Rains of Reason
 *#29
 *Created by Ian Feekes December 6th 2017
 */

/*As you can see I did everything in my power to avoid using a 2-d array to solve this */ 

boolean chessBoardCellColor(String cell1, String cell2) 
{
    boolean c1 = findColour(cell1);
    boolean c2 = findColour(cell2); 
    return(c1==c2);
}

boolean findColour(String cell1)
{
    boolean isWhite= false; 
  if((cell1.charAt(0)=='A')||(cell1.charAt(0)=='C')||(cell1.charAt(0)=='E')||(cell1.charAt(0)=='G'))
    {
        if(((int)cell1.charAt(1)%2==0)) isWhite=true;
        else isWhite=false;
    }
    else
    {
        if((int)cell1.charAt(1)%2!=0)isWhite=true;
        else isWhite=false;
    }
    return isWhite;
}


